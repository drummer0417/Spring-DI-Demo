package nl.androidappfactory.services;

public class PrimaryDutchGreetingService implements GreetingService {

	GreetingRepository greetingRepository;

	public PrimaryDutchGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {

		return greetingRepository.getDutchGreeting();
	}

}
