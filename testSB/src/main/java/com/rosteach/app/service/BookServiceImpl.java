package com.rosteach.app.service;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rosteach.app.entity.Book;
//import com.rosteach.app.repository.AuthorRepository;
import com.rosteach.app.repository.BookRepository;

@Service
@Repository
@Transactional
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	//@Autowired
	//private AuthorRepository authorRepository;
	@Override
	public List<Book> findAll() {
		return Lists.newArrayList(bookRepository.findAll());
	}

	@Override
	public Book findById(Long id) {
		return bookRepository.findOne(id);
	}

	@Override
	public void add(Book book) {
		bookRepository.save(book);
	}

	@Override
	public Book update(Book book,Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
