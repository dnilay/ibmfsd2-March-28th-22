package org.example.spring_jdbc.service;

import java.sql.SQLException;

import org.example.spring_jdbc.model.Employee;

public interface EmployeeService {

	
	public void createEmployee(Employee employee) throws SQLException;
}
