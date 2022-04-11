package org.example.spring_jdbc.repo;

import java.sql.SQLException;

import org.example.spring_jdbc.model.Employee;

public interface EmployeeRepository {
	
	public void createEmployee(Employee employee) throws SQLException;

}
