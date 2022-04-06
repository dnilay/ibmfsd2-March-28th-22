package org.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.example.demo.model.Customer;
import org.example.demo.repo.CustomerRepository;
import org.example.demo.repo.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepository;
	
	

	public CustomerServiceImpl() {
		customerRepository=new CustomerRepositoryImpl();
	}

	@Override
	public void createCustomer(Customer customer) throws SQLException {
		customerRepository.createCustomer(customer);
		
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return customerRepository.displayAllCustomers();
	}

	@Override
	public Customer getCustomerById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerById(id);
	}

	@Override
	public Customer updateCustomerById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
