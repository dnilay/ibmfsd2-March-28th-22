package org.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.demo.config.MySqlConfig;
import org.example.demo.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	private  MySqlConfig mySqlConfig;
	
	
	

	public CustomerRepositoryImpl() {
		mySqlConfig=MySqlConfig.createMySqlConfig();
	}




	@Override
	public void createCustomer(Customer customer) throws SQLException {
		Connection connection=mySqlConfig.getMyConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into customer(first_name,last_name,email) values(?,?,?)");
		preparedStatement.setString(1, customer.getFirstName());
		preparedStatement.setString(2, customer.getLastName());
		preparedStatement.setString(3, customer.getEmail());
		preparedStatement.executeUpdate();
		System.out.println("customer created sucessdfully...");
		
	}

	
}
