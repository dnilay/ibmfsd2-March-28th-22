package org.example.demo.model;

public class Order implements Comparable{

	private String orderName;
	private double orderValue;
	private String orderDate;

	public Order() {
		super();
	}

	public Order(String orderName, double orderValue, String orderDate) {
		super();
		this.orderName = orderName;
		this.orderValue = orderValue;
		this.orderDate = orderDate;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderValue=" + orderValue + ", orderDate=" + orderDate + "]";
	}

	@Override
	public int compareTo(Object o) {
		Order order=(Order)o;
		if(this.orderValue<order.orderValue)
		{
			return -1;
		}
		else if(this.orderValue>order.orderValue)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

}
