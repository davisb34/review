package com.revature.repositories.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.Interview;

public interface InterviewWebRepository extends CrudRepository<Interview, Integer> {

}
