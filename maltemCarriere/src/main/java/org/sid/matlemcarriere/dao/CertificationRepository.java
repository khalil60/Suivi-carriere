package org.sid.matlemcarriere.dao;

import javax.transaction.Transactional;

import org.sid.matlemcarriere.entities.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Transactional
@RepositoryRestResource
public interface CertificationRepository extends JpaRepository<Certification, Long> {

}
