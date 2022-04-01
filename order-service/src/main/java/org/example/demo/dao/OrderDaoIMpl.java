package org.example.demo.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.example.demo.model.Order;

public class OrderDaoIMpl implements OrderDao {

	private final Map<Integer, Order> map;

	public OrderDaoIMpl() {
		map = new HashMap<Integer, Order>();
	}

	@Override
	public void createOrder(Order order) {
		// TODO Auto-generated method stub
		map.put(/*UUID.randomUUID().toString()*/new Random().nextInt(1000), order);
	
		
	}

	@Override
	public Set<Entry<Integer,Order>> fetchAllOrders() {
		Set<Entry<Integer, Order>> set=map.entrySet();
		return set;
	}

	@Override
	public Order findOrderById(int id) {
		Order order = map.get(id);
		return order;
	}

}
