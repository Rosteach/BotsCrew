package com.rosteach.app.service;

import java.util.List;

import com.rosteach.app.entity.Author;

public interface AuthorService {
	public List<Author> findAll();
	public Author findById(Long id);
	public void add(Author author);
	public Author update(Author author, Long id);
	public void delete(Long id);
}
