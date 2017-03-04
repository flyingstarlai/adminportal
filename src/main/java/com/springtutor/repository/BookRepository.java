package com.springtutor.repository;

import com.springtutor.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by izayoi on 3/3/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
