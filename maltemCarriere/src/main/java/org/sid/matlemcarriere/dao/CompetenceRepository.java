package org.sid.matlemcarriere.dao;

import org.sid.matlemcarriere.entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompetenceRepository extends JpaRepository<Competence, Long>{

}
