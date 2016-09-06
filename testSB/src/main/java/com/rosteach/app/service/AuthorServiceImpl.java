package com.rosteach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rosteach.app.entity.Author;
import com.rosteach.app.repository.AuthorRepository;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{
	@Autowired
	private AuthorRepository authRepository;
	@Override
	public List<Author> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Author author) {
		authRepository.saveAndFlush(author);		
	}

	@Override
	public Author update(Author author, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
