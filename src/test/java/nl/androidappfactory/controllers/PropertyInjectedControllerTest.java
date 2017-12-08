package nl.androidappfactory.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import nl.androidappfactory.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController controller;

	@Before
	public void setup() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
	}
}
