package com.spring5.concepts.services;

public class GreetingServiceImpl implements GreetingService {
	
	public static final String GREETING = "Return from Greeting Service Implementation";
	@Override
	public String greet() {
		return GREETING;
	}

}
