package employeeBridgelabz.com;

	public class Employee {
		// Main method
	
		public static void main(String[] args) {
		
				// Declaring variables
				
				int wagePerHour=20;
				int fullTimeHours=8;
				int partTimeHours=4;
				
				System.out.println("Welcome to employee wage calculation!");
				
				/* Generated an integer using random function and checking if its equal to 1 then employee is full-time
					present, if its equal to 2 then employee is part-time present and if its 0 then employee is absent */ 
				
				int attendance = (int) Math.floor(Math.random()*10 % 3);
				if(attendance == 1) {	
					System.out.println("Employee is present!");	
					int dailyWage= wagePerHour*fullTimeHours;
					System.out.println("Daily full time wage: "+dailyWage);
				} 
				else if(attendance ==2) {
					System.out.println("Employee is part time present!");
					int dailyWage = wagePerHour*partTimeHours;
					System.out.println("Daily part time wage is: "+dailyWage);
				}
				else System.out.println("Employee is absent! \n"+"Total daily wage is: 0");
		
		}
	}
