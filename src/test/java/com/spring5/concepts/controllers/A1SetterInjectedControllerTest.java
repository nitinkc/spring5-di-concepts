package com.spring5.concepts.controllers; 

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.spring5.concepts.services.GreetingServiceImpl;

public class A1SetterInjectedControllerTest {
	
	private A1SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new A1SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, setterInjectedController.sayHello());
    }

}
