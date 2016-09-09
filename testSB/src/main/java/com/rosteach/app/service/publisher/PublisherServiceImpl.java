package com.rosteach.app.service.publisher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rosteach.app.entity.Publisher;
import com.rosteach.app.repository.PublisherRepository;

@Service
@Repository
@Transactional
public class PublisherServiceImpl implements PublisherService {
	@Autowired
	private PublisherRepository publisherRepository;
	@Override
	public List<Publisher> findAll() {
		return publisherRepository.findAll();
	}

	@Override
	public Publisher findById(Long id) {
		return publisherRepository.findOne(id);
	}

	@Override
	public void add(Publisher publisher) {
		publisherRepository.save(publisher);
	}

	@Override
	public void delete(Long id) {
		publisherRepository.delete(id);		
	}

}
