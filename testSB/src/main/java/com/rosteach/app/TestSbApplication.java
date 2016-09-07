package com.rosteach.app;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rosteach.app.entity.geocode.GeoLocation;


@SpringBootApplication
public class TestSbApplication {
	private static final Logger logger = LoggerFactory.getLogger(TestSbApplication.class);
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, RestClientException, IOException {
		SpringApplication.run(TestSbApplication.class, args);
		logger.info("in main Thread of Spring Boot");
		
		System.out.println(GeoLocation.getGeoLocation("xml", "Bali").getLat());
	}
	
}
