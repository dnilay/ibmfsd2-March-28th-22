package org.example.demo.repo;

import java.util.List;

import org.example.demo.entity.Customer;

public interface CustomerRepository {
	
	 void createCustomer(Customer customer);
	 
	 List<Customer> getCustomerByFirstName(String firstName);

}
