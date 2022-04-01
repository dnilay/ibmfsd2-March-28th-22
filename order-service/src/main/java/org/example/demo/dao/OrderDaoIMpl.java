package org.example.demo.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.example.demo.model.Order;

public class OrderDaoIMpl implements OrderDao {

	private final Map<Integer, Order> map;

	public OrderDaoIMpl() {
		map = new HashMap<Integer, Order>();
	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		map.put(/*UUID.randomUUID().toString()*/new Random().nextInt(1000), order);
		System.out.println(map);
		return order;
	}

	@Override
	public Collection<Order> fetchAllOrders() {
		Collection<Order> collection = map.values();
		return collection;
	}

	@Override
	public Order findOrderById(int id) {
		Order order = map.get(id);
		return order;
	}

}
