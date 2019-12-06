package com.spring5.concepts.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String greet(String str) {
		return "Injected by the Setter SetterGreetingService: " + str;
	}

}
