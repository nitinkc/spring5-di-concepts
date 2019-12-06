package com.spring5.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring5.concepts.controllers.A0MyController;
import com.spring5.concepts.controllers.A1SetterInjectedController;
import com.spring5.concepts.controllers.A2PropertyInjectedController;
import com.spring5.concepts.controllers.A3ConstructorInjectedController;
import com.spring5.concepts.controllers.A4SetterInjectedController4Qualifier;
import com.spring5.concepts.controllers.A5ConstructorInjectedController4Qualifier;

@SpringBootApplication
public class Spring5DiConceptsApplication {

	public static void main(String[] args) {
		
		//Getting the handle of the context
		ApplicationContext ctx = SpringApplication.run(Spring5DiConceptsApplication.class, args);
		
		//get the bean by ClassName but the first letter as small
		//The Bean is created by the Spring Context handler and we don't have to instantiate a new bean object
		A0MyController controller = (A0MyController) ctx.getBean("a0MyController");
		controller.hello("STEP 1 : Hello from basic Controller");
		
		//Setter Injection
		System.out.println(ctx.getBean(A1SetterInjectedController.class).sayHello());
		
		//Property Injection
		System.out.println(ctx.getBean(A2PropertyInjectedController.class).sayHello());

		//Constructor Injection
		System.out.println(ctx.getBean(A3ConstructorInjectedController.class).sayHello());
		
		//Setter Injection
		System.out.println(ctx.getBean(A4SetterInjectedController4Qualifier.class).sayHello());
		
		//Constructor Injection
		System.out.println(ctx.getBean(A5ConstructorInjectedController4Qualifier.class).sayHello());


	}

}
