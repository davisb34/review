package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.ClientAccDoc;

@Repository
public interface ClientAccDocRepository extends CrudRepository<ClientAccDoc, Integer> {

}
