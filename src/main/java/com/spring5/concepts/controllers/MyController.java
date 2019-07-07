package com.spring5.concepts.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		System.out.println("Hello!!");
		return "foo";
	}

}
