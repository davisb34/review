package com.revature.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.QB_Question;

@Repository
public interface QB_QuestionRepository extends CrudRepository<QB_Question, Integer>{

	QB_Question save(QB_Question persisted);
	
	List<QB_Question> findAll();

	Optional<QB_Question> findByQString(String qString);

}
