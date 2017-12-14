package pl.ja.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.ja.model.Osoby;
import pl.ja.model.Role;
import pl.ja.repository.OsobaRepository;
import pl.ja.repository.RolaRepository;
@Service
public class OsobaService {
	
	private OsobaRepository osobaRepository;
	private RolaRepository rolaRepository;
	
	@Autowired
	public OsobaService(OsobaRepository osobaRepository, RolaRepository rolaRepository) {
		super();
		this.osobaRepository = osobaRepository;
		this.rolaRepository = rolaRepository;
	}
	
	public Osoby addUserwithRoleUser(Osoby osoba) {
		Set<Role> role = new HashSet<>();
		Role rola = rolaRepository.findOneByRola("Osoba");
		role.add(rola);
		osoba.setRole(role);
		osoba.setActive(true);
		return osobaRepository.save(osoba);	
	}
	
	public boolean OsobaIstnieje (String login) {
		return osobaRepository.findOneByLogin(login) != null;
	}
	

}
