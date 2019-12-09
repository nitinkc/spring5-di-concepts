package com.spring5.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String greet(String str) {
		return "Servicio de Saludo Primario ==> "  + str;
	}

}
