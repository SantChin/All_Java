package com.san.java.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.java.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public Book findByBookId(int bookId);

	public List<Book> findAll();

	public Book findByBookIdAndBookIsbn(int bookId,String isbn);
}
