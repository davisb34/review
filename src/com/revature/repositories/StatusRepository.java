package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {
	
	Status findOne(Integer statusId);
	
	List<Status> findAll();
}
