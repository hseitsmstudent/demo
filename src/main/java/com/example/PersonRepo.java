package com.example;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by student on 4/6/17.
 */
@RepositoryRestResource (path = "people")
public interface PersonRepo extends PagingAndSortingRepository<Person,Long>{
    List<Person> findByLastName (@Param("lastName") String lastName);
}

