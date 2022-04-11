package org.example.spring_jdbc.service;

import java.sql.SQLException;

import org.example.spring_jdbc.model.Employee;
import org.example.spring_jdbc.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void createEmployee(Employee employee) throws SQLException {
		employeeRepository.createEmployee(employee);
		
	}

}
