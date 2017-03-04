package com.springtutor.service;

import com.springtutor.domain.Book;

import java.util.List;

/**
 * Created by izayoi on 3/3/17.
 */
public interface BookService {

    Book save(Book book);

    List<Book> findAll();

}
