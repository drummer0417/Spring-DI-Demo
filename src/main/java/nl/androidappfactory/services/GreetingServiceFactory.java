package nl.androidappfactory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	@Autowired
	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String language) {

		switch (language) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);

		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);

		case "es":
			return new PrimarySpanishGreetingService(greetingRepository);

		case "nl":
			return new PrimaryDutchGreetingService(greetingRepository);

		case "it":
			return new PrimaryItalianGreetingService(greetingRepository);
		default:
			return new PrimaryGreetingService(greetingRepository);
		}
	}
}
