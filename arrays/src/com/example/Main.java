package com.example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Employee employee=null;
		//dynamic method dispatching
		System.out.print("Enter ID: ");
		int id=scanner.nextInt();
		System.out.print("First Name: ");
		String firstName=scanner.next();
		System.out.print("Last Name: ");
		String lastName=scanner.next();
		System.out.print("email: ");
		String email=scanner.next();
		System.out.print("Department Name: ");
		String dName=scanner.next();
		System.out.print("Salary: ");
		double salary=scanner.nextDouble();
		System.out.print("RPH: ");
		double rate=scanner.nextDouble();
		
		employee =new RegularEmployee(id, firstName, lastName, email, lastName, salary);
		System.out.println(employee.displayDetails());
		employee=new HourlyPaidEmployee(id, firstName, lastName, email, lastName, rate);
		System.out.println(employee.displayDetails());

	}

}
