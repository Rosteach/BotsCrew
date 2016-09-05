package com.rosteach.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosteach.app.entity.Author;

public interface AuthorRepository extends JpaRepository<Author,Long> {
	
}
