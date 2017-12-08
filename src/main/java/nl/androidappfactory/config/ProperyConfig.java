package nl.androidappfactory.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nl.androidappfactory.examplebeans.FakeDataSource;
import nl.androidappfactory.examplebeans.FakeJmsBroker;

@Configuration
//// @PropertySource({ "classpath:datasource.properties", "classpath:jms.properties" })
//
//// ----->> this has the same effect as the line above
// @PropertySources({
// @PropertySource("classpath:datasource.properties"),
// @PropertySource("classpath:jms.properties")
// })
////
//// ----->> and below is also valid (from Java 8)
////
//// @PropertySource("classpath:datasource.properties")
//// @PropertySource("classpath:jms.properties")
public class ProperyConfig {

	@Value("${aaf.username}")
	String username;

	@Value("${aaf.password}")
	String password;

	@Value("${aaf.url}")
	String url;

	@Value("${aaf.jms.username}")
	String jmsUsername;

	@Value("${aaf.jms.password}")
	String jmsPassword;

	@Value("${aaf.jms.url}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(this.username);
		fakeDataSource.setPassword(this.password);
		fakeDataSource.setUrl(this.url);
		return fakeDataSource;
	}

	@Bean
	FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setJmsUsername(jmsUsername);
		fakeJmsBroker.setJmsPassword(jmsPassword);
		fakeJmsBroker.setJmsUrl(jmsUrl);
		return fakeJmsBroker;
	}
}
