package com.revature.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.AssociateFeedback;

@Repository
public interface AssociateFeedbackRepositories extends CrudRepository<AssociateFeedback, Integer> {

	Optional<AssociateFeedback> findByInterviewId(Integer interviewId);
	
	AssociateFeedback save(AssociateFeedback persisted);
}
