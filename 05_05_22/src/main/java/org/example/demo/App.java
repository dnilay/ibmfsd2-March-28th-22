package org.example.demo;

import java.util.Collection;

import org.example.demo.factory.EmployeeFactory;
import org.example.demo.factory.EmployeeFactoryImpl;

public class App {
	public static void main(String[] args) {
		/*
		 * try {
		 * 
		 * System.out.println(args.length);
		 * 
		 * int x = 100 / 0; System.out.println(x);
		 * 
		 * int a = Integer.parseInt(args[0]); System.out.println(a);
		 * System.out.println(args[0] + " " + args[1]);
		 * 
		 * } catch (NumberFormatException | ArrayIndexOutOfBoundsException |
		 * ArithmeticException e) { System.err.println("exception happened: " +
		 * e.getMessage());
		 * 
		 * }
		 */
		
		EmployeeFactory employeeFactory=new EmployeeFactoryImpl();
		
		/*
		 * try { employeeFactory.createEmployee(); } catch (Exception e) { // TODO:
		 * handle exception System.err.println("Number Format Exception Occured..."); }
		 */
		try {
			Collection<Employee> employees=employeeFactory.getAllAvailableEmployees();
			for(Employee e:employees)
			{
				System.out.println(e);
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
	}
}
