package com.rosteach.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Publisher implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="authors_publishers",
				joinColumns=@JoinColumn(name = "author_id",referencedColumnName ="id"),
				inverseJoinColumns = @JoinColumn(name = "publisher_id",referencedColumnName ="id"))
	private List<Author> authors;
	
	public Publisher(){
		
	}

	public Publisher(String name, List<Author> authors) {
		this.name = name;
		this.authors = authors;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}
