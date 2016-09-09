package com.rosteach.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosteach.app.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{
}
