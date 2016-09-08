package com.rosteach.app;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestClientException;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rosteach.app.entity.geocoder.GeoLocation;

@SpringBootApplication
public class TestSbApplication {
	private static final Logger logger = LoggerFactory.getLogger(TestSbApplication.class);
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, RestClientException, IOException, ParserConfigurationException, SAXException {
		SpringApplication.run(TestSbApplication.class, args);
		logger.info("in main Thread of Spring Boot");
		//String geoCoder = new GeocodeResponse().getGeoCodeData("xml", "Bali");
		GeoLocation loc = GeoLocation.getGeoLocation("xml", "Bali");
		System.out.println(loc.getLat());
		//System.out.println(geoCode.getResults().get(0).getGeometry().getLocation().getLat());
		//System.out.println(geoCode.getResults().get(0).getGeometry().getLocation().getLat());
		//List<GeoCode.Results> results = geoCode.getResults();
		//for(GeoCode.Results result: results){
			//Location geoLocation = (Location)result.getGeometry().getLocation();
		//}
	}
	
}
