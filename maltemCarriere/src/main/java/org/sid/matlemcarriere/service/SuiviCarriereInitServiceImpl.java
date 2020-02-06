package org.sid.matlemcarriere.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.sid.matlemcarriere.dao.CertificationRepository;
import org.sid.matlemcarriere.dao.CommentaireRepository;
import org.sid.matlemcarriere.dao.CompetenceRepository;
import org.sid.matlemcarriere.dao.EmployeeRepository;
import org.sid.matlemcarriere.dao.FileRepository;
import org.sid.matlemcarriere.dao.NiveauRepository;
import org.sid.matlemcarriere.dao.UtilisateurRepository;
import org.sid.matlemcarriere.entities.Commentaire;
import org.sid.matlemcarriere.entities.Employee;
import org.sid.matlemcarriere.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.utility.RandomString;

@Service
public class SuiviCarriereInitServiceImpl implements ISuiviCarriereInitService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Autowired
	private CommentaireRepository commentaireRepository;
	@Autowired
	private FileRepository fileRepository;
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
	public void initEmployees() {
		// TODO Auto-generated method stub
	  List<String> names = new ArrayList<String>();
		names.add("Ndiaye");
		names.add("Cisse");
		names.add("Diop");
	    names.add("Fall");
	    //names.add("Dumas");
		
		utilisateurRepository.findAll().forEach(users->{
			
			Stream.of("Ibrahima","Omar","Ousseynou","Khalil","Aida","Dieynaba","Patrick","Jean").forEach(p->{
				
				Employee employee = new Employee();
				employee.setFirstname(p);
				employee.setDateEmbauche(new Date());
				employee.setLastname(names.get(new Random().nextInt(names.size())));
				employee.setUtilisateur(users);
				employeeRepository.save(employee);
				
				
			});
			
		});
		
		
	}

	

	@Override
	public void initCommentaires() {
		// TODO Auto-generated method stub
		utilisateurRepository.findAll().forEach(user->{
			employeeRepository.findAll().forEach(p->{
				
				Commentaire commentaire = new Commentaire();
				commentaire.setDateCommantaire(new Date());
				commentaire.setUtilisateur(user);
				commentaire.setEmployee(p);
				commentaire.setTexte(RandomString.make());
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
	public void initFileModel() {
		// TODO Auto-generated method stub
		
	}

}
