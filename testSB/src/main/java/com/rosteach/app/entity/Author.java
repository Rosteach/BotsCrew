package com.rosteach.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="author")
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Author implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String fname;
	private String lname;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "author")
	private Set<Book> books; 
	
	public Author(){}
	
	public Author(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
}
