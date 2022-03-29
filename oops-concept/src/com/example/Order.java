package com.example;

public class Order {
	//instance variables
	private int orderId;
	private Item itemDetails;
	//constructor
	//initialize instance variables
	
	//constructor overloading
	public Order()
	{
		this(1000);
		System.out.println("hey i am in default constructor: order");
		
	}
	
	public Order(int orderId) {
		this(orderId,new Item());
		System.out.println("one argument: order");
	}

	//local variable
	public Order(int orderId,Item itemDetails)
	{
		this.orderId=orderId;
		this.itemDetails=itemDetails;
		System.out.println("two argument order");
	}

	
	public void displayOrder()
	{
		System.out.println("Order ID: "+orderId+" Item Details: "+itemDetails.getDetails());
	}
}
