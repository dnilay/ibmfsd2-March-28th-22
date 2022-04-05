package org.example.demo.factory;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Set;

import org.example.demo.Employee;
import org.example.demo.exception.EmployeeDatabaseEmptyException;

public interface EmployeeFactory {
	
	public void createEmployee()throws NumberFormatException,InputMismatchException;
	
	public Collection<Employee> getAllAvailableEmployees()throws EmployeeDatabaseEmptyException;

}
