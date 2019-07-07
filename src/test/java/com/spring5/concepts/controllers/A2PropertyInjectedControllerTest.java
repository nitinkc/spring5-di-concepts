package com.spring5.concepts.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.spring5.concepts.services.GreetingServiceImpl;

public class A2PropertyInjectedControllerTest {
	
	private A2PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new A2PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
    }

}
