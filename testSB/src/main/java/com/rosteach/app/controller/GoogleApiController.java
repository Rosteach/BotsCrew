package com.rosteach.app.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rosteach.app.entity.geocoder.GeoLocation;
import com.rosteach.app.request.pojo.GeolocationRequest;
import com.rosteach.app.service.google.GoogleAPIService;

@RestController
@RequestMapping("/google")
public class GoogleApiController {
	@Autowired
	private GoogleAPIService googleAPIService;
	
	@RequestMapping(value="/location",method=RequestMethod.POST,produces={"application/json"})
	public ResponseEntity<GeoLocation> getGeoLocation(@RequestBody GeolocationRequest request) throws JsonParseException, JsonMappingException, IOException, RestClientException, ParseException{
		return new ResponseEntity<GeoLocation>(googleAPIService.getGeoLocation(request),HttpStatus.OK);
	} 
	
}
