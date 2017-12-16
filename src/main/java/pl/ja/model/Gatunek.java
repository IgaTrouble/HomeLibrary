package pl.ja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Gatunek {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_gat")
	private Integer id;

	private String gatunek;
	
	

	public Gatunek() {
		super();
	}

	public Gatunek(Integer id, String gatunek) {
		super();
		this.id = id;
		this.gatunek = gatunek;
	}
	
	

	@Override
	public String toString() {
		return "Gatunek [id=" + id + ", gatunek=" + gatunek + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	
	
	
}
