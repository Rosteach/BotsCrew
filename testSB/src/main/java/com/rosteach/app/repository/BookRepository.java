package com.rosteach.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosteach.app.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
}
