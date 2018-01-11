package pl.ja.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import pl.ja.model.Books;
import pl.ja.model.Osoby;
import pl.ja.model.Przeczytana;
import pl.ja.model.Role;
import pl.ja.repository.BibRepository;
import pl.ja.repository.OsobaRepository;

@Service
public class BibService {
	
	private BibRepository bibRepository;
	private OsobaRepository osobaRepository;

	@Autowired
	public BibService(BibRepository bibRepository, OsobaRepository osobaRepository) {
		this.bibRepository = bibRepository;
		this.osobaRepository = osobaRepository;
	}
	
	public List<Books> findAll() {
		return bibRepository.findAll();
	}
	
	public Page<Books> getAll(Pageable pageable) {
		return bibRepository.findAll(pageable);
		
	}
	
	public Books addBook(Books books) {
		//data ewentualnie do dodania
		return bibRepository.save(books);	
	}
	
	public void deleteBook(Long id) {
		bibRepository.delete(id);
	}
	
	public Books getBooksById(Long id) {
		return bibRepository.findOne(id);
	}
	
}
