package com.san.java.cntrl;

import java.util.List;
import java.util.Map;

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
	public ResponseEntity<Book> getABook(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/book/all", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@RequestMapping(value = "/book/{id}/{isbn}", method = RequestMethod.GET)
	public ResponseEntity<Book> getBookByNameAndISBN(@PathVariable(value = "id") int id,
			@PathVariable(value = "isbn") String isbn) {
		return new ResponseEntity<>(bookService.getBookByNameAndISBN(id, isbn), HttpStatus.OK);
	}

	// Pagination and Sorting Result

	@RequestMapping(value = "/book/saveall", method = RequestMethod.POST)
	public ResponseEntity<List<Book>> saveAllBook(@RequestBody List<Book> book) {
		return new ResponseEntity<>(bookService.saveAllBooks(book), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/book/findallsorted/{firstSortBy}/{secondSortBy}", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> getAllStudentsAsSorted(@PathVariable String firstSortBy,
			@PathVariable String secondSortBy) {
		return new ResponseEntity<>(bookService.getAllBooksAsSorted(firstSortBy, secondSortBy), HttpStatus.OK);
	}

	@RequestMapping(value = "/book/findallpageble/{pageIndex}/{sizeOfPage}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllStudentsAsPageble(@PathVariable Integer pageIndex,
			@PathVariable Integer sizeOfPage) {
		Map<String, Object> bookList = (Map<String, Object>) bookService.getAllBooksAsPageble(pageIndex, sizeOfPage);
		return new ResponseEntity<>(bookList, HttpStatus.OK);
	}

	@RequestMapping(value = "/book/findallsortedandpageble/{pageIndex}/{sizeOfPage}/{firstSortBy}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllStudentsSortedAsWellPageble(@PathVariable Integer pageIndex,
			@PathVariable Integer sizeOfPage, @PathVariable String firstSortBy) {
		return new ResponseEntity<>(
				(Map<String, Object>) bookService.getAllBooksSortedAsWellPageble(pageIndex, sizeOfPage, firstSortBy),
				HttpStatus.OK);
	}

}
