package com.sam.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.app.module.Laptop;
import com.sam.app.repository.LaptopRepository;

@Service // same as component
public class LaptopService {
	@Autowired
	LaptopRepository repo;
	public void addlaptop(Laptop lap ) {
		repo.save(lap);
	}
	
	public boolean isGoodForProg(Laptop lap) {
		return true;
	}

}
