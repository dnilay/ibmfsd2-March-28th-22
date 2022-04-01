package org.example.demo.service;

import java.util.Collection;

import org.example.demo.model.Order;

public interface OrderService {

	public Order createOrder(Order order);
	public Collection<Order> fetchAllOrders();
	public Order findOrderById(String id);

}
