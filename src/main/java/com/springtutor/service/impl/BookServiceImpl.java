package com.springtutor.service.impl;

import com.springtutor.domain.Book;
import com.springtutor.repository.BookRepository;
import com.springtutor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by izayoi on 3/3/17.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) { return bookRepository.save(book); }

    @Override
    public List<Book> findAll() { return (List<Book>) bookRepository.findAll(); }
}
