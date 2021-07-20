package employeeBridgelabz.com;

public class Employee {
	// Main method
	
	public static void main(String[] args) {
		
		// Declaring variables
		
		int wagePerHour=20;
		int fullTimeHours=8;
		
		System.out.println("Welcome to employee wage calculation!");
		// Generated an integer using random function
		
		int attendance = (int) Math.floor(Math.random()*10 % 2);
		if(attendance == 1) {	
			System.out.println("Employee is present!");	
			int dailyWage= wagePerHour*fullTimeHours;
			System.out.println("Daily full time wage: "+dailyWage);
		} 
		else System.out.println("Employee is absent!");
		
	}
}
