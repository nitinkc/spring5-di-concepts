package com.spring5.concepts.services;

import org.springframework.stereotype.Service;

//If not used, gives:-
//Field greetingService in com.spring5.concepts.controllers.A2PropertyInjectedController 
//required a bean of type 'com.spring5.concepts.services.GreetingServiceImpl' that could not be found.
@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final String GREETING = "Return from Greeting Service Implementation";
	@Override
	public String greet(String str) {
		return GREETING + " : " + str;
	}

}
