package com.spring5.concepts.controllers;

import com.spring5.concepts.services.GreetingService;

public class A1SetterInjectedController {
	
	private GreetingService greetingService;

    public String sayHello(){
        return greetingService.greet();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
