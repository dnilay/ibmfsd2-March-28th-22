package org.example.demo.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.example.demo.model.Order;

public class OrderDaoIMpl implements OrderDao {

	private final Map<String, Order> map;

	public OrderDaoIMpl() {
		map = new HashMap<String, Order>();
	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		map.put(UUID.randomUUID().toString(), order);
		System.out.println(map);
		return order;
	}

	@Override
	public Collection<Order> fetchAllOrders() {
		Collection<Order> collection = map.values();
		return collection;
	}

	@Override
	public Order findOrderById(String id) {
		Order order = map.get(id);
		return order;
	}

}
