package org.example.demo.service;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;

import org.example.demo.model.Order;

public interface OrderService {

	public void createOrder(Order order);
	public Set<Entry<Integer,Order>>  fetchAllOrders();
	public Order findOrderById(int id);

}
