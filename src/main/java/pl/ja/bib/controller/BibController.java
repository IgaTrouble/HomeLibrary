package pl.ja.bib.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ja.model.Books;
import pl.ja.security.AuthenticationComponent;
import pl.ja.service.BibService;
import pl.ja.service.GatunekService;
import pl.ja.service.OsobaService;


@Controller
@RequestMapping("/book")
public class BibController {
	
	private BibService bibService;
	private GatunekService gatunekService;
	private OsobaService osobaService;
	private AuthenticationComponent authentication;
	
	@Autowired
	public BibController(BibService bibService, GatunekService gatunekService, 
			AuthenticationComponent authentication, OsobaService osobaService) {
		this.bibService = bibService;
		this.gatunekService = gatunekService;
		this.authentication = authentication;
		this.osobaService = osobaService;
	}
	
	@RequestMapping("/books")
	public String home(Model model, Pageable pageable) {
		model.addAttribute("isLogin", !authentication.isAnonymous());
		if (!authentication.isAnonymous()) {
			model.addAttribute("osobyLogin", authentication.loginUser());
			model.addAttribute("isAdmin", authentication.isAdmin());
		}
		Page <Books> booksPage = bibService.getAll(pageable);
		model.addAttribute("books", booksPage);
		PageWrapper<Books> page = new PageWrapper <> (booksPage, "/book/books");
		model.addAttribute("page", page);
		return "book/books";
	}
	
	@GetMapping("/addBook")
	public String addBook(Model model) {
		model.addAttribute("books", new Books());
		model.addAttribute("allGatunek", gatunekService.listAllGatunek());
		return "book/addBook";
	}
	
	@PostMapping("/addBook")
	public String addBook (@Valid @ModelAttribute Books books, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "book/addBook";
		}
		System.out.println("Dodano książkę");
	//	model.addAttribute("succsessMesage", "Poprawnie dodałeś książkę do Domowej Biblioteczki");
	//	model.addAttribute("books", new Books());
		bibService.addBook(books);
		return "redirect:/books" + books.getId();
	}
	@GetMapping("/{id}")
	public String view(@PathVariable Long id, Model model) {
		model.addAttribute("books", bibService.getBooksById(id));
		return "books/view";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("books", bibService.getBooksById(id));
		model.addAttribute("allGatunek", gatunekService.listAllGatunek());
		return "book/addBook";
	};

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		bibService.deleteBook(id);
		return "redirect:/book/books";
	}
	
	@GetMapping("/przeczytane")
	public String przeczytane(Model model) {
		model.addAttribute("isLogin", !authentication.isAnonymous());
		if (!authentication.isAnonymous()) {
			model.addAttribute("osobyLogin", authentication.loginUser());
		model.addAttribute("przeczytane", osobaService.showPrzeczytane(authentication.loginUser()));
	}
		return "book/przeczytane";
	}
}
