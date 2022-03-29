package com.example;

public class Item {
	
	private int itemNumber;
	private String itemName;
	private double itemPrice;
	
	public Item() {
		this(1);
		System.out.println("within default: item class");
	}
	
	
	public Item(int itemNumber) {
		this(itemNumber,"Laptop");
		System.out.println("One Args:item");
	}


	public Item(int itemNumber, String itemName) {
		this(itemNumber,itemName,909.0);
		
		System.out.println("two args: item");
	}


	public Item(int itemName2, String itemName, double itemPrice) {
		
		this.itemNumber = itemName2;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		System.out.println("three args: item");
	}
	
	
	public String getDetails()
	{
		return "Item Number: "+itemNumber+" Item Price: "+itemPrice+" Item Name: "+itemName;
	}
	

}
