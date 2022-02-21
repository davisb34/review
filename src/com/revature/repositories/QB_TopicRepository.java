package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.revature.pojos.QB_Topic;

@Repository
public interface QB_TopicRepository extends CrudRepository<QB_Topic, Integer> {


	QB_Topic findOne(Integer topicId);

	QB_Topic findByTopicId(Integer topicId);

	QB_Topic findByTString(String tString);
	List<QB_Topic> findAll();
}
