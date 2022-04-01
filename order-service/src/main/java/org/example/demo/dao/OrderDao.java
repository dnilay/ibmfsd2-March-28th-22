package org.example.demo.dao;

import java.util.Set;
import java.util.Map.Entry;

import org.example.demo.model.Order;

public interface OrderDao {

	public void createOrder(Order order);

	public Set<Entry<Integer,Order>>  fetchAllOrders();

	public Order findOrderById(int id);

}
