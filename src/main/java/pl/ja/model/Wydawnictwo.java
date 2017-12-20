package pl.ja.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="wydawnictwo")
public class Wydawnictwo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_wyd")
	private Integer id;
	@Column(name="name_wyd")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="wydawnictwo")
	private Set<Books> book;	
	
	
	
	
	public Wydawnictwo(Integer id, String name, Set<Books> book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	public Set<Books> getBook() {
		return book;
	}
	public void setBook(Set<Books> book) {
		this.book = book;
	}
	public Wydawnictwo() {
		super();
	}
	public Wydawnictwo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Wydawnictwo [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
