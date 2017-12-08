package nl.androidappfactory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import nl.androidappfactory.services.GreetingRepository;
import nl.androidappfactory.services.GreetingService;
import nl.androidappfactory.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}

	@Bean
	@Primary
	@Profile({ "en", "default" })
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean
	@Primary
	@Profile("nl")
	GreetingService primaryDutchGreetingServices(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("nl");
	}

	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}

	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}

	@Bean
	@Primary
	@Profile("it")
	GreetingService primaryItalianGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("it");
	}

}
