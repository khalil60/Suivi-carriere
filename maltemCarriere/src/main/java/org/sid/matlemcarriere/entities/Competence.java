package org.sid.matlemcarriere.entities;

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
public class Competence {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String tribu;
	private String nomCompetence;
	@ManyToOne
	private Certification certification;
	@ManyToOne
	private Niveau niveau;
	@ManyToOne
	private Employee employee;
}
