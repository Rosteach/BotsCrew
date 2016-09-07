package com.rosteach.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rosteach.app.entity.geocode.GeoLocation;
import com.rosteach.app.service.google.GoogleAPIService;

@RestController
@RequestMapping("/google")
public class GoogleApiController {
	@Autowired
	private GoogleAPIService googleAPIService;
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<GeoLocation> getResponse(){
		return new ResponseEntity<GeoLocation>(googleAPIService.getGeocodeInformation("json", "Bali"),HttpStatus.OK);
	} 
	
}
