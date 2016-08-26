package com.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Book;

@Service
@Transactional
public class BooksStoreServiceImpl implements BooksStoreService{
	@Autowired
	private BooksStoreDAO booksDAO;

	@Override
	public void add(Book book) {
		booksDAO.add(book);		
	}

	@Override
	public Book edit(Book book) {
		return booksDAO.edit(book);
	}

	@Override
	public void remove(int id) {
		booksDAO.remove(id);
	}

	@Override
	public List<Book> all() {
		return booksDAO.all();
	}
	
	
}
