package org.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.example.demo.config.SpringConfig;
import org.example.demo.model.Department;
import org.example.demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		try {

			context = new AnnotationConfigApplicationContext(SpringConfig.class);
			/*
			 * Employee myEmployee=context.getBean("employee",Employee.class); Department
			 * department=context.getBean("department",Department.class);
			 * 
			 * department.setDepartmentName("Accountind");
			 * department.setLocation("Kolkata");
			 * 
			 * myEmployee.setEmployeeId(100); myEmployee.setEmployeeName("John Doe");
			 * myEmployee.setSalary(10000); myEmployee.setDepartment(department);
			 * System.out.println(myEmployee);
			 */
			
			DataSource dataSource=context.getBean("dataSource",DataSource.class);
			Connection connection=dataSource.getConnection();
			System.out.println(connection);
		//	PreparedStatement preparedStatement=connection.prepareStatement("insert into employee(name) values('Marry')");
			//preparedStatement.executeUpdate();
			//System.out.println("inseerted");
			Statement statement=connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
