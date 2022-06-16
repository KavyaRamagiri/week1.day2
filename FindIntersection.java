package week1.day2.assignments;

public class FindIntersection {	// created FindIntersection Class

	public static void main(String[] args) {
		
		// Program to find intersection of two arrays
		
		int ar1[]= {3,2,11,4,6,7};	//defined ar1
		int ar2[]= {1,2,8,4,9,7};	//defined ar2
		for (int i=0;i<ar1.length;i++)	//iterate from i=0 to ar1.length
		{
		for(int j=0;j<ar2.length;j++) {	//iterate from j=0 to ar2.length
			if(ar1[i]==ar2[j]) {		//check condition when both array elements are equal
				System.out.print(ar1[i] + " ");	// print the intersection values
			}
		}
		}
	}
}

 

