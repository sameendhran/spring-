package com.sam.app.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.app.model.Product;
import com.sam.app.services.ProductService;
@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/products")
	public List<Product> getProduct() {
		return service.getProducts();
	}

}
