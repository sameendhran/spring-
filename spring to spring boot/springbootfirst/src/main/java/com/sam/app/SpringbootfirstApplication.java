package com.sam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sam.app.module.Laptop;
import com.sam.app.service.LaptopService;

@SpringBootApplication
public class SpringbootfirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootfirstApplication.class, args);
		
		LaptopService service = context.getBean(LaptopService.class);
		
		
		Laptop lap = context.getBean(Laptop.class);
		service.addlaptop(lap);
		
//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();
	}

}
