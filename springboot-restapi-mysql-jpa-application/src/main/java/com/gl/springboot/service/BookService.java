package com.gl.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springboot.model.Book;
import com.gl.springboot.repositry.IBookRepositry;

@Service
public class BookService {

	@Autowired(required=true)
	IBookRepositry booksRepositry;

	//saving a specific record by using the method save() of CrudRepository
	public void saveBook(Book book) {
		booksRepositry.save(book);
	}

	//getting a specific record by using the method findById() of CrudRepository
	public Book getBookById(int id) {
		return booksRepositry.findById(id).get();
	}

	//getting all books record by using the method findAll() of CrudRepository
	public List<Book> getAllBooks(){

		List<Book> bookList = new ArrayList<Book>();
		booksRepositry.findAll().forEach(book -> bookList.add(book));
		return bookList;
	}
	
	//updating a record
	public void updateBook(Book book) {
		booksRepositry.save(book);
	}
	
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void deleteBook(int id) {
		booksRepositry.deleteById(id);
	}
}
