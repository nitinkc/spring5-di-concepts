package com.spring5.concepts.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring5.concepts.services.GreetingService;

@Controller
public class A3ConstructorInjectedController {

	private GreetingService greetingService;

	//Constructor, With Spring 5 no need to explicitly mention @Autowired, but its a good practice
    public A3ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet("A3ConstructorInjectedController");
    }
}
