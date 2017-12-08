package nl.androidappfactory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import nl.androidappfactory.services.GreetingService;

/**
 * property injections.
 * 
 * this is not what you want this is not what you want this is not what you want
 * 
 * 
 * @author Hans van Meurs
 *
 */
@Controller
public class PropertyInjectedController {

	// use public class instead of interface WRONG!!!!!
	@Autowired
	@Qualifier("propertyGreetingService")
	public GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
