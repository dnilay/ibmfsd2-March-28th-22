package org.example.demo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConfig {
	
	private  Connection connection;
	
	private static MySqlConfig mySqlConfig;
	
	//singletone pattern
	private MySqlConfig()
	{
		
	}
	
	
	public  Connection getMyConnection() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		return connection;
	}
	
	
	public  static MySqlConfig createMySqlConfig()
	{
		if(mySqlConfig==null)
		{
			mySqlConfig=new MySqlConfig();
			
		}
	
		return mySqlConfig;
	}
	
	
	
	

}
