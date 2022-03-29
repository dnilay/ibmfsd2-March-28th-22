package com.example;

public class Elevator {
	
	private  int minFloor=1;
	private  int maxFloor=10;
	private int currentFloor=1;
	private boolean isOpen=false;
	
	public void openDoor()
	{
		isOpen=true;
		System.out.println("door is open");
	}
	
	public void closeDoor()
	{
		isOpen=false;
		System.out.println("door is close");
	}
	
	public void goUp()
	{
		if(currentFloor<maxFloor && isOpen==false)
		{
			currentFloor++;
			System.out.println("going up");
		}
		else
		{
			System.out.println("can not go up");
		}
	}
	
	
	
	public void goDown()
	{
		if(currentFloor>minFloor && isOpen==false)
		{
			currentFloor--;
			System.out.println("going down");
		}
		else
		{
			System.out.println("can not go down");
		}
	}

}
