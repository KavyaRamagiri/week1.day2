package week1.day2.assignments;

public class EmployeeDetails {	//created EmployeeDetails class
	
	//Program to create Employee Details
	
		public void printEmployeeName(String empName, int empId) {		//passing arguments inside method
			System.out.println("Employee Name and empId is: " + empName+","+empId);	//execute empName of string datatype and empID of integer datatype
		}
		
		static void getEmployeeAddress(String empAddress) {
			System.out.println("Employee address is: " +empAddress );	
		}
		
		public double printEmployeeSalary(double empSalary) {
			System.out.println("Employee salary is: " +empSalary );	
			return (empSalary);	// return type is used since datatype is double
		}
		
		long printEmployeeMobileNumber(long mobNum) {
			System.out.println("Employee mobileNum is: " +mobNum );	
			return (mobNum);	// return type is used since datatype is long
		}
		

		public static void main(String[] args) {		
			EmployeeDetails obj=new EmployeeDetails();	// created object for EmployeeDetails Class
			obj.printEmployeeName("Arya", 123);			//passing values inside the arguments
			getEmployeeAddress("#123 Newstreet");		// calling the method in a static way 
			obj.printEmployeeSalary(100000);		
			obj.printEmployeeMobileNumber(9121564001L); 
	
		}
	
}
