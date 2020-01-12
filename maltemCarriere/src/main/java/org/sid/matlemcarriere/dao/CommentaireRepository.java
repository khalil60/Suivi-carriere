package org.sid.matlemcarriere.dao;

import org.sid.matlemcarriere.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

}
