package week1.day2.assignments;

public class PrintDuplicatesInArray {	// created PrintDuplicatesInArray class
	
	//Program to print Duplicate Elements in an array
	
	public static void main(String[] args) {
		int []ary={14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("Length of the array:  " + ary.length);
		for (int i=0;i<ary.length-1;i++) { // iterate from i=0 to ary.length
			for (int j=i+1;j<ary.length;j++) { //iterate from j=1 to ary.length
				if (ary[i]==ary[j]) {			// check condition when array elements are equal
					System.out.println(ary[i]);	//print the Duplicate values
				}
			}
	}
		

}}
