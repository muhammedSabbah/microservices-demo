package com.microservices.demo.twitter.to.kafka;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.demo.twitter.to.kafka.conf.TwitterToKafkaServiceConfData;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);
	private final TwitterToKafkaServiceConfData twitterToKafkaServiceConfData;
	
	
	public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfData confg) {
		this.twitterToKafkaServiceConfData = confg;
	}

	public static void main(String[] args) {
		SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.trace("TRACE");
		LOG.info("App Started - ");
		LOG.warn(twitterToKafkaServiceConfData.getWelcomeMessage());
		LOG.error(Arrays.toString(twitterToKafkaServiceConfData.getTwitterKeywords().toArray(new String[] {})));
		
	}
}
