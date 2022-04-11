package org.example.spring_jdbc.repo;

import java.sql.SQLException;

import org.example.spring_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component(value = "employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createEmployee(Employee employee) throws SQLException {
		
		jdbcTemplate.update("insert into employee(name) values(?)",new Object[] {employee.getEmployeeName()});
		
		
	}

}
