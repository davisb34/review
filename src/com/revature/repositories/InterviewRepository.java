package com.revature.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.revature.pojos.Interview;
@Repository
public interface InterviewRepository extends CrudRepository<Interview, Integer> {
	
	List<Interview> findByAssociateId(Integer associateId);
}