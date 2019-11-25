package com.spring5.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring5.concepts.controllers.MyController;

@SpringBootApplication
public class Spring5DiConceptsApplication {

	public static void main(String[] args) {
		
		//Getting in the context of the 
		ApplicationContext ctx = SpringApplication.run(Spring5DiConceptsApplication.class, args);
		
		//get the bean by ClassName but the first letter as small
		//The Bean is created by the Spring Context handler and we dont have to instantiate a new bean object
		MyController controller = (MyController) ctx.getBean("testing-today");
		controller.hello();
		
	}

}
