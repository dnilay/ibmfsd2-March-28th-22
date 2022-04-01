package org.example.demo.service;

import java.util.Collection;

import org.example.demo.dao.OrderDao;
import org.example.demo.dao.OrderDaoIMpl;
import org.example.demo.model.Order;

public class OrderServiceImpl implements OrderService{
	
	private final OrderDao orderDao;

	public OrderServiceImpl() {
		orderDao=new OrderDaoIMpl();
	}

	@Override
	public Order createOrder(Order order) {
		
		return orderDao.createOrder(order);
	}

	@Override
	public Collection<Order> fetchAllOrders() {
		
		return orderDao.fetchAllOrders();
	}

	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		return orderDao.findOrderById(id);
	}

}
