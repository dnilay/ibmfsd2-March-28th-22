package org.example.demo;

import org.example.demo.config.SpringConfig;
import org.example.demo.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		try {

			context = new AnnotationConfigApplicationContext(SpringConfig.class);
			SessionFactory sessionFactory = context.getBean("sessionFactory", SessionFactory.class);
			org.hibernate.Session session = sessionFactory.openSession();
			Customer customer=new Customer("John", "Doe", "john@email.com");
			session.getTransaction().begin();
			session.persist(customer);
			session.getTransaction().commit();
			System.out.println("custemer created...!");

		} catch (Exception e) {
			// TODO: handle exception\
			e.printStackTrace();
		}
	}
}
