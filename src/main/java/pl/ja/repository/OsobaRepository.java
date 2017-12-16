package pl.ja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ja.model.Osoby;

public interface OsobaRepository extends JpaRepository<Osoby, Integer> {
	Osoby findOneByLogin(String login);
	
	List <Osoby> findAll();
}
