package com.rosteach.app.service.book;

import java.util.List;

import com.rosteach.app.entity.Book;

public interface BookService {
	public List<Book> findAll();
	public Book findById(Long id);
	public void add(Book book);
	public Book update(Book book, Long id);
	public void delete(Long id);
}
