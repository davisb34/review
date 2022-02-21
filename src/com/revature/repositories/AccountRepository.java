package com.revature.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.revature.pojos.Account;
@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
	
	Account findOne(Integer accountId);
	
	List<Account> findAll();
	
}