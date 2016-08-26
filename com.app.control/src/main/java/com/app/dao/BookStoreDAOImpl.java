package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.app.entity.Book;

@Repository
public class BookStoreDAOImpl implements BooksStoreDAO{
	
	private EntityManager em = Persistence.createEntityManagerFactory("derby").createEntityManager();
	
	@Override
	public void add(Book book) {
		em.getTransaction().begin();
		
		if(book.getId()==0){
			em.persist(book);
		}
		else{
			em.merge(book);
		}
		
		em.getTransaction().commit();
		em.getEntityManagerFactory().close();
		em.close();
	}

	@Override
	public Book edit(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
