package nl.androidappfactory.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/24/17.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de Saludo Primario";
	}

	@Override
	public String getGermanGreeting() {

		return "Primärer Grußdienst";

	}

	@Override
	public String getDutchGreeting() {

		return "Hallooootjes primaire begroetingsservice";
	}

	@Override
	public String getItalianGreeting() {

		return "Ciao - Servizio di saluto primario";
	}
}
