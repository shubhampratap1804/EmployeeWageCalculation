package employeeBridgelabz.com;

public class Employee {

	// Main method
	
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage calculation!");

		// Generated an integer using random function
		
		int attendance = (int) Math.floor(Math.random()*10 % 2);
		if(attendance == 1) {	
			System.out.println("Employee is present!");	
		} 
		else System.out.println("Employee is absent!");
		
	}
}
