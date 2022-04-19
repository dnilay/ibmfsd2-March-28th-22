package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomer();

    public Customer createCustomer(Customer customer);
}
