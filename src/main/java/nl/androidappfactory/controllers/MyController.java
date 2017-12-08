package nl.androidappfactory.controllers;

import org.springframework.stereotype.Controller;

import nl.androidappfactory.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {

		return greetingService.sayGreeting();
	}
}
