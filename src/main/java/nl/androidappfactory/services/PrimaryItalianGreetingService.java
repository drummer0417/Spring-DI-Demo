package nl.androidappfactory.services;

public class PrimaryItalianGreetingService implements GreetingService {

	GreetingRepository greetingRepository;

	public PrimaryItalianGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {

		return greetingRepository.getItalianGreeting();
	}

}
