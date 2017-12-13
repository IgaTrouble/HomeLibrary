package pl.ja.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
	@JoinTable(name="osoba_rola")
	private Set<Role> roles;
	

	public Osoby() {
		super();
	}


	@Override
	public String toString() {
		return "Osoby [id=" + id + ", login=" + login + ", pass=" + pass + ", name=" + name + ", last=" + last
				+ ", active=" + active + ", roles=" + roles + "]";
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


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public Osoby(Integer id, String login, String pass, String name, String last, boolean active, Set<Role> roles) {
		super();
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.name = name;
		this.last = last;
		this.active = active;
		this.roles = roles;
	}


	public Osoby(String login, String pass, String name, String last, boolean active, Set<Role> roles) {
		super();
		this.login = login;
		this.pass = pass;
		this.name = name;
		this.last = last;
		this.active = active;
		this.roles = roles;
	}

	




	
	
	
	
	
}
