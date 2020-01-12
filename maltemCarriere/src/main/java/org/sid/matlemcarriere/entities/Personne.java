package org.sid.matlemcarriere.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Personne {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String firstname;
	private String objectifProfessionel;
	private Date dateEmbauche;
	private Date dateDiplome;
	@OneToMany(mappedBy = "personne")
	private Collection<Commentaire> commentaires;
	@OneToMany(mappedBy = "personne")
	private Collection<Curriculum> curriculums; 
	@OneToMany(mappedBy = "personne")
	private Collection<Competence> competences;
	@ManyToOne
	private Utilisateur utilisateur;
	
	

}
