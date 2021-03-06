package org.example.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.example.demo.model.Order;
import org.example.demo.service.OrderService;
import org.example.demo.service.OrderServiceImpl;

/**
 * Hello world!
 *
 */
public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * //primitive type int a; //wrapper type Integer b=new Integer(100);
		 * //unboxing-->wrapper to primitive a=b.intValue(); System.out.println(a);
		 * //auto unboxing a=b; System.out.println(a); int y=900; //boxing--->primitive
		 * to wrapper Integer x=new Integer(y); System.out.println(x);
		 * 
		 * //auto boxing x=y; System.out.println(x);
		 * 
		 * int choice=0; String orderName=null,orderDate=null; double orderValue=0.0;
		 * OrderService orderService=new OrderServiceImpl();
		 * 
		 * do {
		 * 
		 * 
		 * System.out.println("1. Create A New Order.");
		 * System.out.println("2. Fetch All Orders.");
		 * System.out.println("3. Get An Order By Id: ");
		 * System.out.println("4. Update An Order. ");
		 * System.out.println("5. Remove An Order."); System.out.println("0. Exit");
		 * System.out.print("Enter Your Choice: "); choice=scanner.nextInt();
		 * 
		 * switch (choice) { case 1: System.out.print("Enter Order Name: ");
		 * orderName=scanner.next(); System.out.print("Enter Order Value: ");
		 * orderValue=scanner.nextDouble();
		 * System.out.print("Enter Order Date:(dd/mm/yyyy): ");
		 * orderDate=scanner.next(); orderService.createOrder(new Order(orderName,
		 * orderValue, orderDate)); System.out.println(" Order Created Sucessfully...");
		 * break; case 2: Collection<Entry<Integer,Order>>
		 * collection=orderService.fetchAllOrders();
		 * 
		 * Iterator<Entry<Integer, Order>> iterator=collection.iterator();
		 * while(iterator.hasNext()) { System.out.println(iterator.next()); } break;
		 * case 3: System.out.println("Enter Order Id: "); int id=scanner.nextInt();
		 * Order tempOrder=orderService.findOrderById(id);
		 * System.out.println(tempOrder); break; case 4:
		 * System.out.println("under development"); break; case 5:
		 * System.out.println("Under development."); break; case 0:
		 * System.out.println("Bye...!"); System.exit(0); default:
		 * System.out.println("Invalid Choice"); break; }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * } while (choice!=0);
		 */
		Set<Order> set=new TreeSet<Order>();
		set.add(new Order("aa", 1.1, "12/12/2021"));
		set.add(new Order("bb", 1, "12/12/2021"));
		set.add(new Order("cc", 4, "12/12/2021"));
		set.add(new Order("dd", 0.1, "12/12/2021"));
		System.out.println(set);
	}
}
