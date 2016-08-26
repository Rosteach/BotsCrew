package com.app.dao;

import java.util.List;

import com.app.entity.Book;

public interface BooksStoreService {
	public void add(Book book);
	public Book edit(Book book);
	public void remove(int id);
	public List<Book> all();
}
