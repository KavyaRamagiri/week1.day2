package week1.day2.assignments;

public class Car {			 		// created Car class
	
	// Program to create methods for Car class,using modifiers then call with object and execute
	
	public boolean applyBreak() {  	// created methods of Car class
		return (false);
	}
	
	public int applyGear() {		// used public as access modifier
		return 0;
	}
	
	private int switchOnAc() {		// used private as access modifier
		return 1;
	}
	
	boolean applyAcclerate() {		// using default as access modifier
		return true;
	}

	public static void main(String[] args) {
		Car ob=new Car();			// created object for Car class
		boolean br = ob.applyBreak();	//calling the method 
		System.out.println(br);			//executing the value for the same class
		int gr = ob.applyGear();
		System.out.println(gr);
		int ac = ob.switchOnAc();
		System.out.println(ac);
		boolean acc = ob.applyAcclerate();
		System.out.println(acc);
	}

}
