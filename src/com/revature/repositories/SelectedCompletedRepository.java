package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.SelectedCompleted;

@Repository
public interface SelectedCompletedRepository extends CrudRepository<SelectedCompleted, Integer> {
	
	<Optional>List<SelectedCompleted> findByAssociateId(Integer associateId);
}
