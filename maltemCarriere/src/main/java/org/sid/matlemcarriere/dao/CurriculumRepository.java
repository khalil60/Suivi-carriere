package org.sid.matlemcarriere.dao;

import org.sid.matlemcarriere.entities.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {

}
