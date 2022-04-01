package org.example.demo.service;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;

import org.example.demo.dao.OrderDao;
import org.example.demo.dao.OrderDaoIMpl;
import org.example.demo.model.Order;

public class OrderServiceImpl implements OrderService{
	
	private final OrderDao orderDao;

	public OrderServiceImpl() {
		orderDao=new OrderDaoIMpl();
	}

	@Override
	public void createOrder(Order order) {
		
		 orderDao.createOrder(order);
	}

	@Override
	public Set<Entry<Integer,Order>>  fetchAllOrders() {
		
		return orderDao.fetchAllOrders();
	}

	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		return orderDao.findOrderById(id);
	}

}
