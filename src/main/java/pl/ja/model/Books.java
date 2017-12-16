package pl.ja.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_book")
	private Long id;
	@NotEmpty(message="{pl.ja.notEmpty}")
	private String title;
	@NotEmpty(message="{pl.ja.notEmpty}")
	private String author;
	private String wyd;
	private String ISBN;
	private Double price;
	private Integer stan;
	private Integer sklep;
	private Integer lokalizacja;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="books_gat", joinColumns=
		@JoinColumn(name="id_book", referencedColumnName="id_book"),
		inverseJoinColumns = @JoinColumn(name="id_gat", referencedColumnName="id_gat"))
	private Set<Gatunek> gatunek;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="przeczytana")
	private Set<Przeczytana> przeczytana;
	
	
	public Set<Gatunek> getGatunek() {
		return gatunek;
	}

	public void setGatunek(Set<Gatunek> gatunek) {
		this.gatunek = gatunek;
	}

	public Books(Long id, String title, String author, String wyd, String iSBN, Double price, Integer stan,
			Integer sklep, Integer lokalizacja, Set<Gatunek> gatunek) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.wyd = wyd;
		ISBN = iSBN;
		this.price = price;
		this.stan = stan;
		this.sklep = sklep;
		this.lokalizacja = lokalizacja;
		this.gatunek = gatunek;
	}

	public Books() {
		super();
	}

	public Books(String title, String author, String wyd, String iSBN, Double price, Integer stan, Integer sklep,
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", wyd=" + wyd + ", ISBN=" + ISBN
				+ ", price=" + price + ", stan=" + stan + ", sklep=" + sklep + ", lokalizacja=" + lokalizacja
				+ ", gatunek=" + gatunek + "]";
	}

	public Books(String title, String author, Set<Gatunek> gatunek) {
		super();
		this.title = title;
		this.author = author;
		this.gatunek = gatunek;
	}
	
	
	

}
