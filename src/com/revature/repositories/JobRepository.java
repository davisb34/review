package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {
	
	Job findOne(Integer jobId);
	
}
