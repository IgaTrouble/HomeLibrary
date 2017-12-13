package pl.ja;

import java.util.ArrayList;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pl.ja.model.Book;
import pl.ja.repository.BibRepository;

@ComponentScan
@SpringBootApplication
public class BibliotekaSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BibliotekaSpringApplication.class, args);
		
		BibRepository bibRepository = ctx.getBean(BibRepository.class);
		
		//saveBook(ctx);
		
		System.out.println("Lista wszystkich książek");
		bibRepository.findAll().forEach(System.out::println);
		
		System.out.println("Książki drogie");
		bibRepository.findByPriceLessThan(30.0).forEach(System.out::println);
		
		
		
	}	
		
	/*private static void saveBook(ConfigurableApplicationContext ctx) {
		List<Book> books = new ArrayList<>();
	
		BibRepository bibRepository = ctx.getBean(BibRepository.class);
		}
		*/
	
}
