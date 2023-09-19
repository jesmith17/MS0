package com.mongodb.ms0.example.springdata.repository.mysql;

import com.mongodb.ms0.example.springdata.models.Customer;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface CustomerMysqlRepository extends CrudRepository<Customer, String> {

    @Query("Select c from Customer c where c.firstName = ?1 or c.lastName = ?1")
    List<Customer> customerSearch(String name);


    @Query("Select c from Customer c where id = :id")
    Optional<Customer> findById(@Param("id") String id);


}
