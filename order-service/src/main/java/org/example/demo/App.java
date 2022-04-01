package org.example.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import org.example.demo.model.Order;
import org.example.demo.service.OrderService;
import org.example.demo.service.OrderServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
		/*
		 * //primitive type int a; //wrapper type Integer b=new Integer(100);
		 * //unboxing-->wrapper to primitive a=b.intValue(); System.out.println(a);
		 * //auto unboxing a=b; System.out.println(a); int y=900; //boxing--->primitive
		 * to wrapper Integer x=new Integer(y); System.out.println(x);
		 * 
		 * //auto boxing x=y; System.out.println(x);
		 */
    	int choice=0;
    	String orderName=null,orderDate=null;
    	double orderValue=0.0;
    	OrderService orderService=new OrderServiceImpl();
    	
    	do {
    		
    		
    		System.out.println("1. Create A New Order.");
    		System.out.println("2. Fetch All Orders.");
    		System.out.println("3. Get An Order By Id: ");
    		System.out.println("4. Update An Order. ");
    		System.out.println("5. Remove An Order.");
    		System.out.println("0. Exit");
    		System.out.print("Enter Your Choice: ");
    		choice=scanner.nextInt();
    		
    		switch (choice) {
			case 1:
				System.out.print("Enter Order Name: ");
				orderName=scanner.next();
				System.out.print("Enter Order Value: ");
				orderValue=scanner.nextDouble();
				System.out.print("Enter Order Date:(dd/mm/yyyy): ");
				orderDate=scanner.next();
				Order tempOrder=orderService.createOrder(new Order(orderName, orderValue, orderDate));
				System.out.println(tempOrder+" Created Sucessfully...");
				break;
			case 2:
				Collection<Order> collection=orderService.fetchAllOrders();
				
				Iterator<Order> iterator=collection.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
				break;
			case 3:
				System.out.println("Enter Order Id: ");
				String id=scanner.next();
				tempOrder=orderService.findOrderById(id);
				System.out.println(tempOrder);
				break;
			case 4:
				System.out.println("under development");
				break;
			case 5:
				System.out.println("Under development.");
				break;
			case 0:
				System.out.println("Bye...!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
			
		} while (choice!=0);
    	
    }
}
