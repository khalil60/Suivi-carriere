package org.sid.matlemcarriere.dao;



import org.sid.matlemcarriere.entities.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface CertificationRepository extends JpaRepository<Certification, Long> {

}
