package pl.ja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
    private String author;
    private String wyd;
    private String ISBN;
    private Double price;
    
	public Book() {
		super();
	}

	public Book(String title, String author, String wyd, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.wyd = wyd;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", wyd=" + wyd + ", ISBN=" + ISBN
				+ ", price=" + price + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getWyd() {
		return wyd;
	}

	public void setWyd(String wyd) {
		this.wyd = wyd;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}	
    
    
}
