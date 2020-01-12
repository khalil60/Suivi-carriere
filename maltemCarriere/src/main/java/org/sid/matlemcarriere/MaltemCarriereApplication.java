package org.sid.matlemcarriere;

import org.sid.matlemcarriere.service.ISuiviCarriereInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaltemCarriereApplication implements CommandLineRunner {
	
	@Autowired
	private ISuiviCarriereInitService suiviCarriereInitService;

	public static void main(String[] args) {
		SpringApplication.run(MaltemCarriereApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		suiviCarriereInitService.initUtilisateurs();
		suiviCarriereInitService.initPersonnes();
		suiviCarriereInitService.initCommentaires();
		suiviCarriereInitService.initComptences();
		suiviCarriereInitService.initCertifications();
		suiviCarriereInitService.initNivaeu();
		suiviCarriereInitService.initCurriculum();
		
		
	}

}
