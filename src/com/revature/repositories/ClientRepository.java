package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.Client;
import com.revature.pojos.QB_Topic;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
	
	Client findOne(Integer clientId);

	List<Client> findAll();

	Client findByClientName(String clientName);
}
