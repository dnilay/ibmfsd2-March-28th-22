package com.example;

public class HourlyPaidEmployee extends Employee{
	
	private double ratePerHour;

	public HourlyPaidEmployee() {
		super();
	}

	public HourlyPaidEmployee(int employeeId, String firstName, String lastName, String email, String departmentName,double ratePerHour) {
		super(employeeId, firstName, lastName, email, departmentName);
		this.ratePerHour=ratePerHour;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return super.displayDetails()+" Rate Per Hour Is: "+getRatePerHour();
	}
	
	

}
