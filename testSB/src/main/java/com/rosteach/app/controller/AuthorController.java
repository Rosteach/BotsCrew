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

import com.rosteach.app.entity.Author;
import com.rosteach.app.service.author.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<List<Author>> getAll(){
		authorService.findAll();
		return new ResponseEntity<List<Author>>(authorService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<Author> getAuthorByID(@PathVariable Long id){
		return new ResponseEntity<Author>(authorService.findById(id),HttpStatus.OK);
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST,consumes={"application/json"},produces={"application/json"})
	public ResponseEntity<Author> addAuthor(@RequestBody Author author){
		authorService.add(author);
		return new ResponseEntity<Author>(author,HttpStatus.CREATED);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT,consumes={"application/json"},produces={"application/json"})
	public Author updateBook(@RequestBody Author author, @PathVariable Long id){
		return null;
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE,consumes={"application/json"},produces={"application/json"})
	public void deletePublisher(@PathVariable Long id){
		authorService.delete(id);
	}
}
