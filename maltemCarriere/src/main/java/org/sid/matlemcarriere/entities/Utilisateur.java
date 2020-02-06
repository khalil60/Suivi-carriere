package org.sid.matlemcarriere.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String prenom;
	private String login;
	private String motPasse;
	private Date dateLogin;
	@OneToMany(mappedBy = "utilisateur")
	private Collection<Commentaire> commentaires;
	@OneToMany(mappedBy = "utilisateur")
	private Collection<Employee> employees;
	

}
