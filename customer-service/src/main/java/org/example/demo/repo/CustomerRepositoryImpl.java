package org.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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




	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		List<Customer> list=new ArrayList<Customer>();
		Connection connection=mySqlConfig.getMyConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select id, first_name,last_name,email from customer");
		while(resultSet.next())
		{
			Customer customer=new Customer();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setFirstName(resultSet.getString(2));
			customer.setLastName(resultSet.getString(3));
			customer.setEmail(resultSet.getString(4));
			list.add(customer);
			
		}
		return list;
	}




	@Override
	public Customer getCustomerById(int id) throws SQLException{
		List<Customer> list=new ArrayList<Customer>();
		Connection connection=mySqlConfig.getMyConnection();
		PreparedStatement pstatement=connection.prepareStatement("select id, first_name,last_name,email from customer where id=?");
		pstatement.setInt(1, id);
		ResultSet resultSet= pstatement.executeQuery();
	
		while(resultSet.next())
		{
			Customer customer=new Customer();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setFirstName(resultSet.getString(2));
			customer.setLastName(resultSet.getString(3));
			customer.setEmail(resultSet.getString(4));
			list.add(customer);
			
		}
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}




	@Override
	public Customer updateCustomerById(int id)  throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void deleteCustomerById(int id) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	
}
