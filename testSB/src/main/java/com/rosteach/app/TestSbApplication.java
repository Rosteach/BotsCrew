package com.rosteach.app;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TestSbApplication {
	private static final Logger logger = LoggerFactory.getLogger(TestSbApplication.class);
	
	public static void main(String[] args) throws IOException, ParseException{
		SpringApplication.run(TestSbApplication.class, args);
		logger.info("in main Thread of Spring Boot");
	}

}
