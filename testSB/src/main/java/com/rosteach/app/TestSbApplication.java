package com.rosteach.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class TestSbApplication {
	private static final Logger logger = LoggerFactory.getLogger(TestSbApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TestSbApplication.class, args);
		logger.info("in main Thread of Spring Boot");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
