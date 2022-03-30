package com.example;
//derived class
public class RegularEmployee extends Employee {
	
	private double salary;

	public RegularEmployee() {
		
		//the keyword super is used to call base class constructor
		super();
	}

	public RegularEmployee(int employeeId, String firstName, String lastName, String email, String departmentName,double salary) {
		
		super(employeeId, firstName, lastName, email, departmentName);
		this.salary=salary;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return super.displayDetails()+ "Salary: "+getSalary();
	}
	
	

}
