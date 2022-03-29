package org.example;
import com.example.Elevator;
import com.example.MyDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elevator elevator=new Elevator();
		elevator.closeDoor();
		for(int i=0;i<11;i++)
		{
			elevator.goUp();
		}
		
		MyDate myDate=new MyDate();
		
	}
	
	

	
}
