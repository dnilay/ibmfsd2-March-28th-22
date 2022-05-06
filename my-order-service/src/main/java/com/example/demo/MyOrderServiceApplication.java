package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Order;

@SpringBootApplication
public class MyOrderServiceApplication {

	private final OrderRepository orderRepository;

	public MyOrderServiceApplication(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyOrderServiceApplication.class, args);
	}

	@PostConstruct
	public void loadData() {
		List<Order> list = Stream.of(new Order(1, "Pencil"), new Order(2, "Laptop")).collect(Collectors.toList());

		orderRepository.saveAll(list);
	}

}
