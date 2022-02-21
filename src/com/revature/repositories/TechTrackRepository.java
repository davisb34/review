package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.TechTrack;

@Repository
public interface TechTrackRepository extends CrudRepository<TechTrack, Integer> {

}
