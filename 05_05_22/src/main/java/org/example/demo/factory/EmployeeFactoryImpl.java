package org.example.demo.factory;

import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.example.demo.Employee;
import org.example.demo.exception.EmployeeDatabaseEmptyException;

public class EmployeeFactoryImpl implements EmployeeFactory {

	private Map<Integer, Employee> employeeMap;
	private static Scanner scanner=new Scanner(System.in);
	public EmployeeFactoryImpl() {
		employeeMap = new HashMap<Integer, Employee>();
	}

	@Override
	public void createEmployee() throws NumberFormatException,InputMismatchException{
		int employeeId; 
		String firstName;
		String lastName;
		String email;
		System.out.print("Enter Employee ID: ");
		employeeId=scanner.nextInt();
		System.out.print("Enter First Name: ");
		firstName=scanner.next();
		System.out.print("Enter Last Name: ");
		lastName=scanner.next();
		System.out.print("Enter email: ");
		email=scanner.next();
		employeeMap.put(new Random().nextInt(10000), new Employee(employeeId, firstName, lastName, email));
		System.out.println("Employee Created Sucessfully...");
		System.out.println(employeeMap);
		
	}

	@Override
	public Collection<Employee> getAllAvailableEmployees() throws EmployeeDatabaseEmptyException{
		// TODO Auto-generated method stub
		Collection<Employee> c=employeeMap.values();
		if(c.isEmpty())
		{
			throw new EmployeeDatabaseEmptyException("no employees are available try add some employees and come back here.");
		}
		return c;
	}

}
