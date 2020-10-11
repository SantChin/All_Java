package com.san.java.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.san.java.entity.Book;
import com.san.java.repo.BookRepository;
import com.san.java.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);

	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(int id) {
		return bookRepository.findByBookId(id);
	}

	@Override
	public Book getBookByNameAndISBN(int bookId, String isbn) {
		return bookRepository.findByBookIdAndBookIsbn(bookId, isbn);
	}

	@Override
	@Transactional
	public List<Book> saveAllBooks(List<Book> BookList) {
		return bookRepository.saveAll(BookList);
	}

	@Override
	@Transactional
	public List<Book> getAllBooksAsSorted(String firstSortBy, String secondSortBy) {
		String[] fieldsToSort = { firstSortBy, secondSortBy };
		Sort sort = Sort.by(Direction.DESC, fieldsToSort);
		// another way to sort
		// Sort anotherWayToSort =
		// Sort.by(firstSortBy).ascending().and(Sort.by(secondSortBy).descending());
		return bookRepository.findAll(sort);
	}

	@Override
	@Transactional
	public Map<String, Object> getAllBooksAsPageble(int pageIndex, int sizeOfPage) {
		Pageable pageable = PageRequest.of(pageIndex, sizeOfPage);
		Page<Book> page = bookRepository.findAll(pageable);
		Map<String, Object> response = new HashMap<String, Object>();
		List<Book> bookList = new ArrayList<>();

		if (page != null) {
			bookList = (List<Book>) page.getContent();
		}
		response.put("result", bookList);
		response.put("currentPage", page.getNumber());
		response.put("totalItems", page.getTotalElements());
		response.put("totalPages", page.getTotalPages());
		return response;
	}

	@Override
	@Transactional
	public Map<String, Object> getAllBooksSortedAsWellPageble(int pageIndex, int sizeOfPage, String sortByParameter) {
		Pageable pageable = PageRequest.of(pageIndex, sizeOfPage, Direction.DESC, sortByParameter);
		Page<Book> page = bookRepository.findAll(pageable);
		Map<String, Object> response = new HashMap<String, Object>();
		List<Book> bookList = new ArrayList<>();
		if (page != null) {
			bookList =  (List<Book>) page.getContent();
		}
		response.put("result", bookList);
		response.put("currentPage", page.getNumber());
		response.put("totalItems", page.getTotalElements());
		response.put("totalPages", page.getTotalPages());
		return response;
	}

}
