package com.example.demo.service;

import com.example.demo.model.OrderEntity;

public interface OrderService {
	
	public OrderEntity createOrder(OrderEntity orderEntity);
	
	public Iterable<OrderEntity> getAllOrders();

}
