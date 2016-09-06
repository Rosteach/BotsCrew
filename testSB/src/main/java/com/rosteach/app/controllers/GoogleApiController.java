package com.rosteach.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosteach.app.service.GoogleAPIService;

@RestController
@RequestMapping("/google")
public class GoogleApiController {
	@Autowired
	private GoogleAPIService googleAPIService;
	
	@RequestMapping("/")
	public String getResponse(){
		System.out.println(googleAPIService.getLatitude());
		return googleAPIService.getLatitude();
	} 
	
}
