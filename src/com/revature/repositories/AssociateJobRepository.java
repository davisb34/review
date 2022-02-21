package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revature.pojos.AssociateJob;

public interface AssociateJobRepository extends CrudRepository<AssociateJob, Integer> {
	
	List<AssociateJob> findByAssociateId(Integer associateId);
}
