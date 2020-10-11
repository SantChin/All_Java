package com.san.java.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.san.java.entity.Book;

@Component
public interface BookService {

	public Book saveBook(Book book);

	public Book getBook(int id);

	public List<Book> getAllBooks();

	public Book getBookByNameAndISBN(int id, String isbn);

	public List<Book> saveAllBooks(List<Book> BookList);

	public List<Book> getAllBooksAsSorted(String firstSortBy, String secondSortBy);

	public Map<String, Object> getAllBooksAsPageble(int pageIndex, int sizeOfPage);

	public Map<String, Object> getAllBooksSortedAsWellPageble(int pageIndex, int sizeOfPage, String sortByParameter);

}
