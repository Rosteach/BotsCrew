package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Book;

@Repository
public class BookStoreServiceImpl implements BooksStoreService{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2"); 
	EntityManager em=emf.createEntityManager();
	
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
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Book> books = (List<Book>)em.createNativeQuery("select * from book order by name", Book.class).getResultList(); 
		em.getTransaction().commit();
		return books;
	}
}
