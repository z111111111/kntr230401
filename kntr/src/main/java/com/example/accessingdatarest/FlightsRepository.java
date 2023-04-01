package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "flights", path = "flights")
public interface FlightsRepository extends PagingAndSortingRepository<Flight, Long>, CrudRepository<Flight,Long> {

    List<Flight> findById(@Param("id") long id);
}