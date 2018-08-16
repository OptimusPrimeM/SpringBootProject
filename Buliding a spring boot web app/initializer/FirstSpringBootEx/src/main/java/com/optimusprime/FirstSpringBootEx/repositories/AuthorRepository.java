package com.optimusprime.FirstSpringBootEx.repositories;

import com.optimusprime.FirstSpringBootEx.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
