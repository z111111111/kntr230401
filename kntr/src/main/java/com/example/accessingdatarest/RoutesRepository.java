package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "routes", path = "routes")
public interface RoutesRepository extends PagingAndSortingRepository<Route, Long>, CrudRepository<Route,Long> {

    List<Route> findById(@Param("id") long id);

}
