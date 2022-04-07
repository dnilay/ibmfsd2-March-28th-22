package org.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   SessionFactory sessionFactory=
    			   new Configuration().configure().addAnnotatedClass(OrderEntity.class).buildSessionFactory();
    	   
    	   Session session=sessionFactory.openSession();
    	   OrderEntity orderEntity=new OrderEntity("Tab");
    	   session.getTransaction().begin();
    	   session.save(orderEntity);
    	   session.getTransaction().commit();
    	   System.out.println("saved to db");
    	   
    	   
    	   
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
