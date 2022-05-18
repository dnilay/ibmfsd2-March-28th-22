package com.example.mongodbdemo.repo;

import com.example.mongodbdemo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {
    @Query
    Customer findByCustomerId(String customerId);
}
