package com.rosteach.app;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rosteach.app.entity.geocode.GeoLocation;
import com.rosteach.app.entity.geocode.pojo.GeoCode;
import com.rosteach.app.util.GeocodeResponse;


@SpringBootApplication
public class TestSbApplication {
	private static final Logger logger = LoggerFactory.getLogger(TestSbApplication.class);
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, RestClientException, IOException {
		SpringApplication.run(TestSbApplication.class, args);
		logger.info("in main Thread of Spring Boot");
		String geoCode = GeocodeResponse.getGeoCode("json", "Bali");
		System.out.println(geoCode);
		//System.out.println(geoCode.getResults().get(0).getGeometry().getLocation().getLat());
		//System.out.println(geoCode.getResults().get(0).getGeometry().getLocation().getLat());
		//List<GeoCode.Results> results = geoCode.getResults();
		//for(GeoCode.Results result: results){
			//GeoLocation geoLocation = (GeoLocation)result.getGeometry().getLocation();
		//}
	}
	
}
