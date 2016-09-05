package com.rosteach.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rosteach.app.entity.Book;
import com.rosteach.app.repository.AuthorRepository;
import com.rosteach.app.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BooksController {
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<List<Book>> greeting(){
		return new ResponseEntity<List<Book>>(bookRepository.findAll(),HttpStatus.OK);
	}
}
