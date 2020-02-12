package org.sid.matlemcarriere.dao;

import org.sid.matlemcarriere.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
