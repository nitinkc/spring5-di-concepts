package com.spring5.concepts.controllers;

import com.spring5.concepts.services.GreetingServiceImpl;

public class A2PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.greet();
    }


}
