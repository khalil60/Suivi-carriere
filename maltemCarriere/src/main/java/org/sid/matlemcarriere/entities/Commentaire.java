package org.sid.matlemcarriere.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Commentaire {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texte;
	private Date dateCommantaire;
	@ManyToOne
	private Employee employee;
	@ManyToOne
	private Utilisateur utilisateur;
	
	
	

}
