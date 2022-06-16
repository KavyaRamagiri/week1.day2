package week1.day2.assignments;

public class Twowheeler {
	// declared below global variables with appropriate values
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=3015126151125L;
		boolean isPunctured=false;
		String bikeName="Pleasureplus";
		double runningKM=1200;
				
		public static void main(String[] args) {			
			Twowheeler obj=new Twowheeler(); //created object for TwoWheeler class
			int a= obj.noOfWheels; //call the variable inside main method and assign to reference variable of integer datatype.
			System.out.println(a); //print the values using reference variable
			short a1=obj.noOfMirrors;
			System.out.println(a1);
			long a2=obj.chassisNumber;
			System.out.println(a2);
			boolean a3=obj.isPunctured;
			System.out.println(a3);
			String a4=obj.bikeName;
			System.out.println(a4);
			double a5=obj.runningKM;	
			System.out.println(a5);					
		}		
	}

