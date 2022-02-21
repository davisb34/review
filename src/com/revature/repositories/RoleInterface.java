package com.revature.repositories;

import java.sql.SQLSyntaxErrorException;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.revature.pojos.Role;

@Repository
public interface RoleInterface {
	
	Role findByRole(String role) throws SQLSyntaxErrorException;
	

}
