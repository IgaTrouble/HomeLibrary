package pl.ja.bib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ja.model.Books;
import pl.ja.model.Osoby;
import pl.ja.service.BibService;
import pl.ja.service.OsobaService;


	@Controller
	@RequestMapping("/admin")
	public class AdminController {
		
		private OsobaService osobaService;
		
		
		@Autowired
		public AdminController(OsobaService osobaService) {
			this.osobaService = osobaService;
		}
		
		
		@GetMapping("/config")
		public String config() {
			return "admin/config";
		}
		
		
		@GetMapping("/osoby")
		public String osoby(Model model, Pageable pageable) {
			Page <Osoby> osobyPage = osobaService.getAll(pageable);
			model.addAttribute("osoby", osobyPage);
			PageWrapper<Osoby> page = new PageWrapper <> (osobyPage, "/osoby");
			model.addAttribute("page", page);
			return "admin/osoby";
		}
		
		
		
}
