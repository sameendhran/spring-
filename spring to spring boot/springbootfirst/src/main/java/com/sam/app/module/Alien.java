package com.sam.app.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Value("25")
	private int age;
    Computer comp;
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public int getAge() {
    	return age;
    }
    @Autowired
    @Qualifier("desk")
    public void setComp(Computer comp) {
    	this.comp = comp;
    }

    public Computer getComp() {
    	return comp;
    }
    	
    	public  void code() {
    	comp.compile();
    }
}
    
