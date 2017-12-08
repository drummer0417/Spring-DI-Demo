package nl.androidappfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import nl.androidappfactory.examplebeans.FakeDataSource;
import nl.androidappfactory.examplebeans.FakeJmsBroker;

@SpringBootApplication
@ComponentScan(basePackages = { "nl.androidappfactory.controllers", "nl.androidappfactory.services",
		"nl.androidappfactory.config" })
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		// MyController controller = context.getBean(MyController.class);

		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);

		FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);

		System.out.println("datasource: " + fakeDataSource);
		System.out.println("jsmsbroker: " + fakeJmsBroker);
	}
}
