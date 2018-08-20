package com.optimusprime.FirstSpringBootEx.repositories;

import com.optimusprime.FirstSpringBootEx.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long>{
}
