package pl.ja.bib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ja.model.Book;
import pl.ja.service.BibService;


@Controller
public class BibController {
	
	private BibService bibService;
	
	@Autowired
	public BibController(BibService bibService) {
		this.bibService = bibService;
	}
	
	@RequestMapping("/")
	public String home(Model model) {
		List <Book> books = bibService.findAll();
		model.addAttribute("books", books);
		System.out.println(books);
		return "index";
	}
	


}
