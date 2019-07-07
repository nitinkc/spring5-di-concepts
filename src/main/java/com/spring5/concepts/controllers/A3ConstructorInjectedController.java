package com.spring5.concepts.controllers;

import com.spring5.concepts.services.GreetingService;

public class A3ConstructorInjectedController {

	private GreetingService greetingService;

	//Constructor
    public A3ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
