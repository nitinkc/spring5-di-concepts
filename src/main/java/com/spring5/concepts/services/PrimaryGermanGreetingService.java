package com.spring5.concepts.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

	@Override
	public String greet(String str) {
		return "Vom primären Begrüßungsdienst ==> "  + str;
	}

}
