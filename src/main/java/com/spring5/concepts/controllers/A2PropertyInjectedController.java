package com.spring5.concepts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring5.concepts.services.GreetingServiceImpl;

//The annotation marks this as a Spring Component
//that tells Spring Framework to manage this as a spring bean.
@Controller
public class A2PropertyInjectedController {
	
	//NPE if not used.
	//By using autowired, we are telling Spring to inject this as a 
	@Autowired
	public GreetingServiceImpl greetingService;

	/*
	* greetingService is a property and
	* */
    public String sayHello(){
        return greetingService.greet("A2PropertyInjectedController");
    }
}