package com.rosteach.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<String> greeting(){
		return new ResponseEntity<String>("Hello Test Spring Boot project",HttpStatus.OK);
	}
}
