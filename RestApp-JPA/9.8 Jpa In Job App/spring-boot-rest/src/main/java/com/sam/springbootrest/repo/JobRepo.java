package com.sam.springbootrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.springbootrest.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

	

	
	
	

	

	


}
