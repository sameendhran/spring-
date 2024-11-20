package com.sam.app.module;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desk")
//@Primary
public class Desktop implements Computer{
	public void compile() {
		System.out.println("compiling using desktop");
	}

}
