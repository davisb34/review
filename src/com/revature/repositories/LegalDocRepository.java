package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.LegalDoc;

@Repository
public interface LegalDocRepository extends CrudRepository<LegalDoc, Integer> {

}
