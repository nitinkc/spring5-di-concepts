# Dependency Injection Concepts using Spring 5

### Dependency Injection is done in 3 ways

	• By class properties - least preferred
	• Using private properties is <span style="color:red">**EVIL**</span>
	• By Setters - Area of much debate
	• By Constructor - Most Preferred

DI can be done with Concrete Classes or with Interfaces

DI with Concrete Classes should be avoided

#### DI via Interfaces is highly preferred
	• Allows runtime to decide implementation to inject
	• Follows Interface Segregation Principle of SOLID
	• Also, makes your code more testable
	
	
## Brances
*  remotes/origin/a1spring-context-example
* remotes/origin/a2-manual-di
* remotes/origin/a3-spring5-di
* remotes/origin/a4-qualifier-use-in-controller
* remotes/origin/a5-primary-annotation
* remotes/origin/master

