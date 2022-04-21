package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.OrderEntity;
import com.example.demo.repo.OrderRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

	private final OrderRepository orderRepository;
	
	@Override
	public OrderEntity createOrder(OrderEntity orderEntity) {
		// TODO Auto-generated method stub
		return orderRepository.save(orderEntity);
	}

	@Override
	public Iterable<OrderEntity> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Optional<OrderEntity> findOrderByOrderid(String orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findByOrderId(orderId);
	}

}
