package org.sid.matlemcarriere.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.sid.matlemcarriere.dao.CertificationRepository;
import org.sid.matlemcarriere.dao.CommentaireRepository;
import org.sid.matlemcarriere.dao.CompetenceRepository;
import org.sid.matlemcarriere.dao.CurriculumRepository;
import org.sid.matlemcarriere.dao.NiveauRepository;
import org.sid.matlemcarriere.dao.PersonneRepository;
import org.sid.matlemcarriere.dao.UtilisateurRepository;
import org.sid.matlemcarriere.entities.Commentaire;
import org.sid.matlemcarriere.entities.Personne;
import org.sid.matlemcarriere.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuiviCarriereInitServiceImpl implements ISuiviCarriereInitService {
	
	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Autowired
	private CommentaireRepository commentaireRepository;
	@Autowired
	private CurriculumRepository curriculumRepository;
	@Autowired
	private CompetenceRepository competenceRepository;
	@Autowired
	private NiveauRepository niveauRepository;
	@Autowired
	private CertificationRepository certificationRepository;
	
	
	@Override
	public void initUtilisateurs() {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Sanchez");
		names.add("Picart");
		names.add("Cailler");
		names.add("Dumas");
			
			Stream.of("Marie","Paul","Helene","Margaux").forEach(prenom->{
				
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setPrenom(prenom);
				utilisateur.setName(names.get(new Random().nextInt(names.size())));
			    utilisateur.setDateLogin(new Date());
				utilisateurRepository.save(utilisateur);
			});
			
	
		
		
	}
	

	@Override
	public void initPersonnes() {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.add("Ndiaye");
		names.add("Cisse");
		names.add("Diop");
		names.add("Fall");
		names.add("Dumas");
		
		utilisateurRepository.findAll().forEach(users->{
			
			Stream.of("Ibrahima","Omar","Ousseynou","Khalil","Aida","Dieynaba","Patrick","Jean").forEach(p->{
				
				Personne personne = new Personne();
				personne.setFirstname(p);
				personne.setDateEmbauche(new Date());
				personne.setName(names.get(new Random().nextInt(names.size())));
				personne.setUtilisateur(users);
				personneRepository.save(personne);
				
				
			});
			
		});
		
		
	}

	

	@Override
	public void initCommentaires() {
		// TODO Auto-generated method stub
		utilisateurRepository.findAll().forEach(user->{
			personneRepository.findAll().forEach(p->{
				
				Commentaire commentaire = new Commentaire();
				commentaire.setDateCommantaire(new Date());
				commentaire.setUtilisateur(user);
				commentaire.setPersonne(p);
				commentaireRepository.save(commentaire);
				
			});
		});
		
	}

	@Override
	public void initComptences() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initCertifications() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initNivaeu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initCurriculum() {
		// TODO Auto-generated method stub
		
	}

}
