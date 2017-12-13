package pl.ja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_book")
	private Integer id;

	private String title;
	private String author;
	private String wyd;
	private String ISBN;
	private Double price;
	private Integer stan;
	private Integer sklep;
	private Integer lokalizacja;

	public Book() {
		super();
	}

	public Book(String title, String author, String wyd, String iSBN, Double price, Integer stan, Integer sklep,
			Integer lokalizacja) {
		super();
		this.title = title;
		this.author = author;
		this.wyd = wyd;
		ISBN = iSBN;
		this.price = price;
		this.stan = stan;
		this.sklep = sklep;
		this.lokalizacja = lokalizacja;
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

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStan() {
		return stan;
	}

	public void setStan(Integer stan) {
		this.stan = stan;
	}

	public Integer getSklep() {
		return sklep;
	}

	public void setSklep(Integer sklep) {
		this.sklep = sklep;
	}

	public Integer getLokalizacja() {
		return lokalizacja;
	}

	public void setLokalizacja(Integer lokalizacja) {
		this.lokalizacja = lokalizacja;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", wyd=" + wyd + ", ISBN=" + ISBN
				+ ", price=" + price + ", stan=" + stan + ", sklep=" + sklep + ", lokalizacja=" + lokalizacja + "]";
	}

}
