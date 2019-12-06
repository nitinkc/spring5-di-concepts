# Dependency Injection Concepts using Spring 5

JUnit - to mimic manual Dependency injection
           
### Dependency Injection is done in 3 ways

	• By class properties - least preferred
	    •  Using private properties is <span style="color:red">**EVIL**</span>
	• By Setters - Area of much debate
	
```java
private GreetingService greetingService;
@Autowired
//@Qualifier("setterGreetingService")
public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
}
```
	• By Constructor - Most Preferred
```java
private GreetingService greetingService;
//Constructor, With Spring 5 no need to explicitly mention @Autowired, but its a good practice
public A3ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
}
```

DI can be done with Concrete Classes or with Interfaces

DI with Concrete Classes should be avoided

#### DI via Interfaces is highly preferred
	• Allows runtime to decide implementation to inject
	• Follows Interface Segregation Principle of SOLID
	• Also, makes your code more testable

@Primary - Multiple beans of the same type and
           one is intended to go in by default 
           
@Profile - making a profile active from the application.properties

default profile is added 

@Profile({"en","default"})


