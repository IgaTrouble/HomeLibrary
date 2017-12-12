package pl.ja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.ja.model.Book;
import pl.ja.repository.BibRepository;

@Service
public class BibService {
	
	private BibRepository bibRepository;

	@Autowired
	public BibService(BibRepository bibRepository) {
		this.bibRepository = bibRepository;
	}
	
	public List<Book> findAll() {
		List <Book> books = bibRepository.findAll();
		System.out.println("Lista książek: " + books);
		return books;
	}

	}
