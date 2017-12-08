package nl.androidappfactory.services;

import org.springframework.stereotype.Service;

@Service
public final class PropertyGreetingService implements GreetingService {

	public final static String HELLO_GURU = "Hello Guru";

	@Override
	public String sayGreeting() {

		return "Hello i'm injected by the Property";
	}
}
