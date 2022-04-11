package org.example.demo;

import java.util.List;

import org.example.demo.config.SpringConfig;
import org.example.demo.entity.Customer;
import org.example.demo.repo.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		try {

			context = new AnnotationConfigApplicationContext(SpringConfig.class);

			CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
			customerRepository.createCustomer(new Customer("John", "Public", "john1@email.com"));

			List<Customer> list=customerRepository.getCustomerByFirstName("John");
			for(Customer c: list)
			{
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO: handle exception\
			e.printStackTrace();
		}
	}
}
