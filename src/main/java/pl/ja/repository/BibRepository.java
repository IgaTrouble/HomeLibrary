package pl.ja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.ja.model.Book;


@Repository
public interface BibRepository extends JpaRepository<Book, Integer> {

	List <Book> findAll();
	List <Book> findByPriceLessThan(Double price);
	
}
