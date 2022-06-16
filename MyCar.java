package week1.day1.assignments;

import week1.day2.assignments.Car;	//imported Car class

// Program to call methods of another class say Car class of different package

public class MyCar {	// created MyCar Class

	public static void main(String[] args) { 
		Car ob1=new Car();		// created object for existing Car class
		int ag = ob1.applyGear();	// calling the method having public access modifiers of Car class since default and private cannot be accessed
		System.out.println(ag);		// executing the value
		boolean ab = ob1.applyBreak();	
		System.out.println(ab);
	}

	}


