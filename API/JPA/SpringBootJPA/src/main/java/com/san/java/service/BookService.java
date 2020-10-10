package com.san.java.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.san.java.entity.Book;

@Component
public interface BookService {

	public Book saveBook(Book book);
	
	public Book getBook(int id);
	
	public List<Book> getAllBooks();
	
	
}
