package org.sid.matlemcarriere.dao;

import org.sid.matlemcarriere.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface  EmployeeRepository extends JpaRepository<Employee, Long> {

}
