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

Component Scan : By default the package containing the main method is scanned. In addition to add other
packages, following annotation is used.

```java
@ComponentScan(basePackages = {"com.spring5.concepts","com.spring5.services"})
``` 

### External Property

```java
@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${nitin.username}")
    String user;
    @Value("${nitin.pwd}")
    String password;
    @Value("${nitin.dburl}")
    String url;
}
```

If application.properties or application.jml is used, the Spring will automatically wire them in for the use.

Read Externalized Configuration - 

[https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config]

