package com.gl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.springboot.model.Book;
import com.gl.springboot.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//mark class as controller
@RestController
@RequestMapping("/api/v1/subbu")
public class BookContoller {
	
	@Autowired
	private BookService bookService;

	//creating post mapping that post the book detail in the database
	@PostMapping("/addbook")
	private int saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return book.getBookId();   //book id will be sent to response body of postman after inserting book data
	}

	//creating a get mapping that retrieves the details of a specific book
	@GetMapping("/getbook/{bookid}")
	private Book getBooks(@PathVariable("bookid") int bookid) {
		return bookService.getBookById(bookid);
	}

	//creating & get mapping that retrieves all the books details from the database
	@GetMapping("getallbooks")
	private List<Book>  getAllBooks(){
		return bookService.getAllBooks();
	}

	//creating put mapping that updates that book details
	@PutMapping("/updatebook")
	private Book update(@RequestBody Book book) {
		bookService.updateBook(book);
		return book;
	}

	//creating a delete mapping that deletes a specified book
	@DeleteMapping("/deletebook/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid) {
		bookService.deleteBook(bookid);
	}

}
