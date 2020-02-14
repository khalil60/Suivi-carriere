package org.sid.matlemcarriere.entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	private String lastname;
	private String firstname;
	private String objectifProfessionel;
	private int experience;
	@Temporal(TemporalType.DATE)
	private Date dateEmbauche;
	@Temporal(TemporalType.DATE)
	private Date dateDiplome;
	private String email;
	@OneToMany(mappedBy = "employee")
	private Collection<Commentaire> commentaires;
	@OneToMany(mappedBy = "employee")
	private Collection<FileModel> fileModel; 
	@OneToMany(mappedBy = "employee")
	private Collection<Competence> competences;
	@ManyToOne
	private Utilisateur utilisateur;
	
	

}
