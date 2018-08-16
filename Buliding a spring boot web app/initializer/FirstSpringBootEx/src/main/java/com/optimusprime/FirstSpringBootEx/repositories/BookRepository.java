package com.optimusprime.FirstSpringBootEx.repositories;

import com.optimusprime.FirstSpringBootEx.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
