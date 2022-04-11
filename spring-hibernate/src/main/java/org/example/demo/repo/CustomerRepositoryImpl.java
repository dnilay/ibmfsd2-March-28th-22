package org.example.demo.repo;

import java.util.List;

import javax.persistence.TypedQuery;

import org.example.demo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Component(value = "customerRepository")
@EnableTransactionManagement
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public void createCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(customer);
		session.getTransaction().commit();
		System.out.println("created");
	}

	@Override
	@Transactional
	public List<Customer> getCustomerByFirstName(String firstName) {
		Session session=sessionFactory.openSession();
		
		//hbql
		TypedQuery<Customer> query=session.createQuery("SELECT C FROM  Customer C WHERE C.firstName=:fName",Customer.class);
		query.setParameter("fName", firstName);
		return query.getResultList();
	}

}
