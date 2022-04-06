package org.example.demo;

import java.sql.SQLException;

import org.example.demo.model.Customer;
import org.example.demo.repo.CustomerRepository;
import org.example.demo.repo.CustomerRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       CustomerRepository customerRepository=new CustomerRepositoryImpl();
       
       try {
		customerRepository.createCustomer(new Customer("Rahul", "Dravid", "rahul@email.com"));
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
    }
}
