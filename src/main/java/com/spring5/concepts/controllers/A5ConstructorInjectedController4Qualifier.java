package com.spring5.concepts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring5.concepts.services.GreetingService;

@Controller
public class A5ConstructorInjectedController4Qualifier {

	private GreetingService greetingService;

    public A5ConstructorInjectedController4Qualifier(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet("A5ConstructorInjectedController4Qualifier");
    }

}
