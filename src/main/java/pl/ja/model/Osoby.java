package pl.ja.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Osoby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_osoby")
	private Integer id;
	
	@Email(message="{pl.ja.email}")
	@NotEmpty(message="{pl.ja.notEmpty}")
	private String login;
	
	@Length(min=5, message="{pl.ja.password.lenght}")
	private String pass;
	
	@NotEmpty(message="{pl.ja.notEmpty}")
	private String name;
	
	@NotEmpty(message="{pl.ja.notEmpty}")
	private String last;
	
	private boolean active;
	

	@ManyToMany
	@JoinTable(name="osoba_rola", joinColumns=
		@JoinColumn(name="id_osoby", referencedColumnName="id_osoby"),
		inverseJoinColumns = @JoinColumn(name="id_roli", referencedColumnName="id_roli"))
	private Set<Role> rola;
	
	@OneToMany(mappedBy="osoba")
	private Set<Przeczytana> przeczytana;
	
	
	
	public Set<Role> getRola() {
		return rola;
	}


	public void setRola(Set<Role> rola) {
		this.rola = rola;
	}


	public Set<Przeczytana> getPrzeczytana() {
		return przeczytana;
	}


	public void setPrzeczytana(Set<Przeczytana> przeczytana) {
		this.przeczytana = przeczytana;
	}


	public Osoby() {
		super();
	}


	@Override
	public String toString() {
		return "Osoby [id=" + id + ", login=" + login + ", pass=" + pass + ", name=" + name + ", last=" + last
				+ ", active=" + active + ", rola=" + rola + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Set<Role> getRole() {
		return rola;
	}


	public void setRole(Set<Role> role) {
		this.rola = role;
	}


	public Osoby(Integer id, String login, String pass, String name, String last, boolean active, Set<Role> roles) {
		super();
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.name = name;
		this.last = last;
		this.active = active;
		this.rola = rola;
	}


	public Osoby(String login, String pass, String name, String last, boolean active, Set<Role> roles) {
		super();
		this.login = login;
		this.pass = pass;
		this.name = name;
		this.last = last;
		this.active = active;
		this.rola = rola;
	}

	




	
	
	
	
	
}
