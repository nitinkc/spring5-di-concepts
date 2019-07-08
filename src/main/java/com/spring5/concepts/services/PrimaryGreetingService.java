package com.spring5.concepts.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String greet(String str) {
		return "From Primary Greeting Service" + str;
	}

}
