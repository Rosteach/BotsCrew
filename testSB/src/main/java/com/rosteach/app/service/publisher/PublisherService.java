package com.rosteach.app.service.publisher;

import java.util.List;

import com.rosteach.app.entity.Publisher;

public interface PublisherService {

	public List<Publisher> findAll();
	public Publisher findById(Long id);
	public void add(Publisher publisher);
	public void delete(Long id);

}
