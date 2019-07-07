package com.spring5.concepts.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.spring5.concepts.services.GreetingServiceImpl;

public class A3ConstructorInjectedControllerTest {
	private A3ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new A3ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, constructorInjectedController.sayHello());
    }

}
