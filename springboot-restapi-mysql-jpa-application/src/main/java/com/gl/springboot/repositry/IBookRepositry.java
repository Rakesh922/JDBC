package com.gl.springboot.repositry;

import org.springframework.data.repository.CrudRepository;
//repository that extends CeudRepositry

import com.gl.springboot.model.Book;

public interface IBookRepositry extends CrudRepository<Book, Integer> {

}
