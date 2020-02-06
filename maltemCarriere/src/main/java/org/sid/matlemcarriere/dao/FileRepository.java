package org.sid.matlemcarriere.dao;


import javax.transaction.Transactional;

import org.sid.matlemcarriere.entities.FileModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Transactional
@RepositoryRestResource
public interface FileRepository extends CrudRepository<FileModel, Long> {
	
	

}
