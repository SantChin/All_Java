package com.san.java.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.san.java.entity.Book;
import com.san.java.service.BookService;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/book/save", method = RequestMethod.POST)
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public ResponseEntity<Book> registerUser(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
	}

}
