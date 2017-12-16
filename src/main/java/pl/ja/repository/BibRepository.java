package pl.ja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.ja.model.Books;


@Repository
public interface BibRepository extends JpaRepository<Books, Long> {

	List <Books> findAll();
	List <Books> findByPriceLessThan(Double price);
	
}
