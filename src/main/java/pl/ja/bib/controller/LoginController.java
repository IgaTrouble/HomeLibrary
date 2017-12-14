package pl.ja.bib.controller;

import javax.validation.Valid;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.ja.model.Osoby;
import pl.ja.security.AuthenticationComponent;
import pl.ja.service.OsobaService;

@Controller
public class LoginController {
	
	private OsobaService osobaService;
	private AuthenticationComponent authentication;
	
	public LoginController(@Autowired OsobaService osobaService, @Autowired AuthenticationComponent authentication) {
		this.osobaService=osobaService;
		this.authentication=authentication;
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("isLogin", !authentication.isAnonymous());
		if(!authentication.isAnonymous()) {
			model.addAttribute("osobyLogin", authentication.loginUser());
			model.addAttribute("isAdmin", authentication.isAdmin());
		}
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/rejestracja")
	public String rejestracja(Model model) {
		model.addAttribute("osoba", new Osoby());
		return "rejestracja";
	}	
	
	@PostMapping("/rejestracja")
	public String rejestracja (@Valid @ModelAttribute Osoby osoba, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "rejestracja";
		}
		if(osobaService.OsobaIstnieje(osoba.getLogin())) {
			result.rejectValue("login", "error.user.exist", "Masz już konto w Domowej bibliotece");
			return "rejestracja";
		}
		Osoby savedOsoba = osobaService.addUserwithRoleUser(osoba);
		System.out.println("Zapisano nową osobę");
		model.addAttribute("successMesage", "Poprawnie założyłeś konto, zostałeś zapisany w Domowej bibliotece");
		model.addAttribute("osoba", new Osoby());
		return "rejestracja";
	}
}
