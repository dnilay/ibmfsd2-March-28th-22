package org.example.demo.beans;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	public Employee() {
		this(101,"Marry","Public","marry@email.com");
		
		System.out.println("within deafult cons...");
	}
	public Employee(int employeeId, String firstName, String lastName, String email) {
		System.out.println("within another cons...");
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	

}
