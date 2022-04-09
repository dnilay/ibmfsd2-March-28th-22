package org.example.demo;

import org.example.demo.config.SpringConfig;
import org.example.demo.model.Department;
import org.example.demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
       try {
    	   
			context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	   Employee myEmployee=context.getBean("employee",Employee.class);
    	   Department department=context.getBean("department",Department.class);
			/*
			 * department.setDepartmentName("Accountind");
			 * department.setLocation("Kolkata");
			 */
    	   myEmployee.setEmployeeId(100);
    	   myEmployee.setEmployeeName("John Doe");
    	   myEmployee.setSalary(10000);
    	   myEmployee.setDepartment(department);
    	   System.out.println(myEmployee);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
