package com.microservices.demo.twitter.to.kafka.conf;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfData {
	private List<String> twitterKeywords;
	
	private String welcomeMessage;

}
