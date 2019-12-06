package com.spring5.concepts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring5.services.GreetingService;

@Controller
public class A1SetterInjectedController {
	
	private GreetingService greetingService;
    //Setter Injection
    @Autowired
    //@Qualifier("setterGreetingService")
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet("A1SetterInjectedController");
    }
}
