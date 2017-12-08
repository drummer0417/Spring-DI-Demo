package nl.androidappfactory.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import nl.androidappfactory.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController controller;

	@Before
	public void setup() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
	}
}
