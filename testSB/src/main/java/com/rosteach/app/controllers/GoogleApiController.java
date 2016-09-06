package com.rosteach.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rosteach.app.entity.geocode.GeocodeInformation;
import com.rosteach.app.service.GoogleAPIService;

@RestController
@RequestMapping("/google")
public class GoogleApiController {
	@Autowired
	private GoogleAPIService googleAPIService;
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<GeocodeInformation> getResponse(){
		System.out.println(googleAPIService.getGeocodeInformation("json", "Bali"));
		return new ResponseEntity<GeocodeInformation>(googleAPIService.getGeocodeInformation("json", "Bali"),HttpStatus.OK);
	} 
	
}
