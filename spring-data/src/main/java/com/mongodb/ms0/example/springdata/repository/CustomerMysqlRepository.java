package com.mongodb.ms0.example.springdata.repository;

import com.mongodb.ms0.example.springdata.models.Customer;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerMysqlRepository extends CrudRepository<Customer, String> {

    @Query("Select c from Cusotmer c where c.first_name = ?1 or c.last_name = ?1")
    List<Customer> customerSearch(String name);





    @Query("Select c from Customer c where id = :id")
    Optional<Customer> findById(@Param("id") String id);


}
