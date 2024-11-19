package com.sam.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sam.app.model.Product;
@Service
public class ProductService {
	
	List<Product> products = Arrays.asList(
			new Product(101,"Iphone",5000),
			new Product(102,"samsung",7000),
			new Product(103,"vivo",2000)
			);

	public List<Product> getProducts(){
		return products;
	}
}
