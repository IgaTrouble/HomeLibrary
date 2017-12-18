package pl.ja.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Przeczytana {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_book")
	private Books book = new Books();
	
	@ManyToOne
	@JoinColumn(name="id_osoby")
	private Osoby osoba = new Osoby();
	private Date data;
	private boolean koszyk;
	private String opis;
	
	
	
	public Przeczytana(Integer id, Books book, Osoby osoba, Date data, boolean koszyk, String opis) {
		super();
		this.id = id;
		this.book = book;
		this.osoba = osoba;
		this.data = data;
		this.koszyk = koszyk;
		this.opis = opis;
	}
	public Przeczytana() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public Osoby getOsoba() {
		return osoba;
	}
	public void setOsoba(Osoby osoba) {
		this.osoba = osoba;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isKoszyk() {
		return koszyk;
	}
	public void setKoszyk(boolean koszyk) {
		this.koszyk = koszyk;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	@Override
	public String toString() {
		return "Przeczytana [id=" + id + ", book=" + book + ", osoba=" + osoba + ", data=" + data + ", koszyk=" + koszyk
				+ ", opis=" + opis + "]";
	}
	

	
	
	
}
