package org.sid.matlemcarriere;

import org.sid.matlemcarriere.entities.Certification;
import org.sid.matlemcarriere.entities.Commentaire;
import org.sid.matlemcarriere.entities.Employee;
import org.sid.matlemcarriere.entities.Utilisateur;
import org.sid.matlemcarriere.service.ISuiviCarriereInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MaltemCarriereApplication implements CommandLineRunner {
	
	@Autowired
	private ISuiviCarriereInitService suiviCarriereInitService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MaltemCarriereApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Employee.class,Utilisateur.class,Certification.class,Commentaire.class);
		/*repositoryRestConfiguration.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("http://localhost:4200")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS","HEAD","GET","POST","PUT","DELETE","PATCH");*/
		suiviCarriereInitService.initEmployees();
		suiviCarriereInitService.initCommentaires();
		suiviCarriereInitService.initComptences();
		suiviCarriereInitService.initCertifications();
		suiviCarriereInitService.initNivaeu();
		suiviCarriereInitService.initFileModel();
		
		
	}

}
