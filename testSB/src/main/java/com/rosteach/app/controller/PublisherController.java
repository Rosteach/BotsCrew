package com.rosteach.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rosteach.app.entity.Book;
import com.rosteach.app.entity.Publisher;
import com.rosteach.app.service.publisher.PublisherService;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<List<Publisher>> getAll(){
		return new ResponseEntity<List<Publisher>>(publisherService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<Publisher> getPublisherByID(@PathVariable Long id){
		return new ResponseEntity<Publisher>(publisherService.findById(id),HttpStatus.OK);
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST,consumes={"application/json"},produces={"application/json"})
	public ResponseEntity<Publisher> addPublisher(@RequestBody Publisher publisher){
		publisherService.add(publisher);
		return new ResponseEntity<Publisher>(publisher,HttpStatus.CREATED);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT,consumes={"application/json"},produces={"application/json"})
	public Publisher updateBook(@RequestBody Book book, @PathVariable Long id){
		return null;
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE,consumes={"application/json"},produces={"application/json"})
	public void deletePublisher(@PathVariable Long id){
		publisherService.delete(id);
	}
}
