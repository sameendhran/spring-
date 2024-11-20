package com.sam.app.repository;

import org.springframework.stereotype.Repository;

import com.sam.app.module.Laptop;
@Repository // same as component
public class LaptopRepository {
	public void save(Laptop lap) {
		System.out.println("saved in db");
	}

}
