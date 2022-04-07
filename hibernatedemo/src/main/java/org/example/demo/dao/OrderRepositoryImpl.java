package org.example.demo.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.example.demo.OrderEntity;
import org.example.demo.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OrderRepositoryImpl implements OrderRepository {
	
	private SessionFactory sessionFactory;
	private Session session;
	

	public OrderRepositoryImpl() {
	
		super();
		sessionFactory=HibernateConfig.getSessionFactory();
		session=sessionFactory.openSession();
	}

	@Override
	public void createOrder(OrderEntity orderEntity) {
		
		session.getTransaction().begin();
		session.save(orderEntity);
		session.getTransaction().commit();
		System.out.println("order created. sucessfully..");

	}

	@Override
	
	public List<OrderEntity> getAllOrders() {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		TypedQuery<OrderEntity> query=session.createQuery("FROM OrderEntity",OrderEntity.class);
		session.getTransaction().commit();
		return query.getResultList();
	}

	@Override
	public OrderEntity findOrderById(int id) {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		OrderEntity orderEntity=session.get(OrderEntity.class, id);
		session.getTransaction().commit();
		return orderEntity;
	}

}
