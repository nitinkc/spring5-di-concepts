package com.spring5.concepts.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class A0MyController {
	
	public void hello(String str) {
		System.out.println("A0MyController!! " + str);
	}

}
