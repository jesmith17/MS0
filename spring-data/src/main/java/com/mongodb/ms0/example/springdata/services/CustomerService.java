package com.mongodb.ms0.example.springdata.services;

import com.mongodb.ms0.example.springdata.models.Customer;
import com.mongodb.ms0.example.springdata.repository.mysql.CustomerMysqlRepository;
import com.mongodb.ms0.example.springdata.repository.mongodb.CustomerMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerMongoRepository mongoRepository;

    @Autowired
    private CustomerMysqlRepository repository;


    public Optional<Customer> getCustomerById(String id) {
        return repository.findById(id);
    }


    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> customerSearch(String name) {
        return repository.customerSearch(name);
    }
}
