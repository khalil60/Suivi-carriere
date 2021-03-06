package org.sid.matlemcarriere.dao;


import javax.transaction.Transactional;

import org.sid.matlemcarriere.entities.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Transactional
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface FileRepository extends JpaRepository<FileModel, Long> {
	
	

}
