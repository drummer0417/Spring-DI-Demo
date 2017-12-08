package nl.androidappfactory.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jt on 5/24/17.
 */
public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	@Autowired
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
}
