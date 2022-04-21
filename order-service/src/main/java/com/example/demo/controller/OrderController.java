package com.example.demo.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderEntity;
import com.example.demo.service.OrderService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class OrderController {
	private final OrderService orderService;
	
	@PostMapping("/orders")
	public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity)
	{
		return new ResponseEntity<OrderEntity>(orderService.createOrder(orderEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<?> fetchOrdes()
	{
		return ResponseEntity.ok(orderService.getAllOrders());
	}
	
	@GetMapping("/orders/{orderId}")
	public ResponseEntity<Optional<OrderEntity>> fetchOrderByOrderId(@PathVariable("orderId") String orderId)
	{
		Optional<OrderEntity> order=orderService.findOrderByOrderid(orderId);
		
		return ResponseEntity.ok(order);
		
	}

}
