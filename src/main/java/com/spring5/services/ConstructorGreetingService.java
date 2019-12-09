package com.spring5.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String greet(String str) {
		return "Injected via the constructor!" + " : " + str;
	}

}
