package org.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "emp")
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	//attribuite level DI
	//@Autowired
	private Department department;
	
	public Employee() {
		super();
	}
	
	
	//constructor injection
	
	 // @Autowired 
	  public Employee(Department department) {
	  
	  this.department = department; }
	 



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Department getDepartment() {
		return department;
	}


	//setter DI
	//@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", department=" + department + "]";
	}



	

}
