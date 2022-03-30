package com.example;
//base class
public class Employee extends Object{
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String departmentName;
	public Employee() {
		
	}
	public Employee(int employeeId, String firstName, String lastName, String email, String departmentName) {
	
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.departmentName = departmentName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String displayDetails()
	{
		return "ID: "+getEmployeeId()+" First Name: "+getFirstName()+" Last Name: "+getLastName()+" Email: "+getEmail()+" Department Name: "+getDepartmentName();
	}

}
