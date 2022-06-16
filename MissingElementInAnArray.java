package week1.day2.assignments;

import java.util.Arrays;				//imported util.Arrays since Arrays is a class

public class MissingElementInAnArray {	// created MissingElementInAnArray class
	
	//Program to find Missing Element in an array

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};	// define the array values
		System.out.println("Length of the array:  " + arr.length);	// print the array length
		Arrays.sort(arr);	// sort the array
		for (int i=1;i<arr.length;i++) {	// iterate from i=1 to arr.length
			if(i!=arr[i-1])					//1!=ar[0] only when condition satisfies enters inside 
			{
				System.out.println("Missing element in array : " + i);	// prints missing element
				break;	// terminate the loop
			}
		}
	}
}
