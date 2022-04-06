package org.example.demo;

import java.util.List;
import java.util.Scanner;

import org.example.demo.model.Customer;
import org.example.demo.service.CustomerService;
import org.example.demo.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	private final static Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		try {

			int choice = 0;
			CustomerService customerService=new CustomerServiceImpl();

			do {

				System.out.println("1. Create Customer.");
				System.out.println("2. Get All Customers.");
				System.out.println("3. Get Customer By Id.");
				System.out.println("0. Exit.");
				System.out.print("Enter Your Choice: ");
				choice=SCANNER.nextInt();
				switch (choice) {
				case 1:
					Customer customer=new Customer();
					System.out.println("Enter First Name: ");
					customer.setFirstName(SCANNER.next());
					System.out.println("Enter Last Name: ");
					customer.setLastName(SCANNER.next());
					System.out.println("Enter Email: ");
					customer.setEmail(SCANNER.next());
					customerService.createCustomer(customer);
					break;
					
				case 2:
					List<Customer> list=customerService.displayAllCustomers();
					for(Customer c:list)
					{
						System.out.println(c);
					}
					break;
				case 3:
					System.out.print("Enter Customer ID: ");
					Customer customer2=customerService.getCustomerById(SCANNER.nextInt());
					if(customer2==null)
					{
						System.out.println("no such customer found....");
					}
					System.out.println("Customer Found: "+customer2);
					break;
				case 0:
					System.out.println("Bye...");
					System.exit(0);
				default:
					System.out.println("Invalid Choice");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
