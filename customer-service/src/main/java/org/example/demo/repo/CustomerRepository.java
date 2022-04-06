package org.example.demo.repo;

import java.sql.SQLException;

import org.example.demo.model.Customer;

public interface CustomerRepository {
	
	public void createCustomer(Customer customer) throws SQLException;

}
