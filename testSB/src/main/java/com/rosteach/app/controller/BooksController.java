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
import com.rosteach.app.service.book.BookService;

@RestController
@RequestMapping("/book")
public class BooksController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<List<Book>> getAll(){
		bookService.findAll();
		return new ResponseEntity<List<Book>>(bookService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<Book> getBookByID(@PathVariable Long id){
		return new ResponseEntity<Book>(bookService.findById(id),HttpStatus.OK);
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST,consumes={"application/json"},produces={"application/json"})
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		System.out.println("--------"+book);
		//authorRepository.save(book.getAuthor());
		//book.setAuthor(new Author("Jim","Smith"));
		bookService.add(book);
		return new ResponseEntity<Book>(book,HttpStatus.CREATED);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT,consumes={"application/json"},produces={"application/json"})
	public Book updateBook(@RequestBody Book book, @PathVariable Long id){
		return null;
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE,consumes={"application/json"},produces={"application/json"})
	public void deleteBook(@PathVariable Long id){
		bookService.delete(id);
	}
}
