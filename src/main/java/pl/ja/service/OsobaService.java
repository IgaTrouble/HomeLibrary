package pl.ja.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pl.ja.model.Books;
import pl.ja.model.Osoby;
import pl.ja.model.Przeczytana;
import pl.ja.model.Role;
import pl.ja.repository.OsobaRepository;
import pl.ja.repository.PrzeczytanaRepository;
import pl.ja.repository.RolaRepository;

@Service
public class OsobaService {

	private OsobaRepository osobaRepository;
	private RolaRepository rolaRepository;
	private PrzeczytanaRepository przeczytanaRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCrtyptPasswordEncoder;

	@Autowired
	public OsobaService(OsobaRepository osobaRepository, RolaRepository rolaRepository,
			PrzeczytanaRepository przeczytanaRepository) {
		super();
		this.osobaRepository = osobaRepository;
		this.rolaRepository = rolaRepository;
		this.przeczytanaRepository = przeczytanaRepository;
	}

	public Osoby addUserwithRoleUser(Osoby osoby) {
		Set<Role> role = new HashSet<>();
		Role rola = rolaRepository.findOneByRola("user");
		role.add(rola);
		osoby.setRole(role);
		osoby.setActive(true);
		osoby.setPass(bCrtyptPasswordEncoder.encode(osoby.getPass()));
		return osobaRepository.save(osoby);
	}

	public boolean OsobaIstnieje(String login) {
		return osobaRepository.findOneByLogin(login) != null;
	}

	public Page<Osoby> getAll(Pageable pageable) {
		List<Osoby> osoby = osobaRepository.findAll();
		return osobaRepository.findAll(pageable);

	}

/*	public List<Books> showPrzeczytane(String login) {
		Osoby osoba = osobaRepository.findOneByLogin(login);
		Set<Przeczytana> przeczytana = osoba.getPrzeczytana();
		List<Books> books = new ArrayList<>();
		for (Przeczytana przeczytane : przeczytana) {
			Books book = przeczytane.getBook();
			books.add(book);
		}
		return books;
	} */
	
	public Set<Przeczytana> showPrzeczytane(String login) {
	Osoby osoba = osobaRepository.findOneByLogin(login);
	Set<Przeczytana> przeczytana = osoba.getPrzeczytana();
	return przeczytana;
} 

}
