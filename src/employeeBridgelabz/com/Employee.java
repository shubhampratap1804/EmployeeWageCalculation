package employeeBridgelabz.com;

	public class Employee {
		// Main method
	
		public static void main(String[] args) {
		
				// Declaring variables
				
				int wagePerHour=20;
				int fullTimeHours=8;
				int partTimeHours=4;
				
				System.out.println("Welcome to employee wage calculation!");
				
				/* Generated an integer using random function and if its equal to 1 then employee is full-time
				   present, if its equal to 2 then employee is part-time present and if its 0 then employee is absent */ 
				
				int attendance = (int) Math.floor(Math.random()*10 % 3);
				
				switch(attendance) {
				
				case 0:
					System.out.println("Employee is absent! \n"+"Total daily wage is: 0");
					break;
					
				case 1:
					System.out.println("Employee is present!");	
					int dailyFullTimeWage= wagePerHour*fullTimeHours;
					System.out.println("Daily full time wage: "+dailyFullTimeWage);
					break;
					
				case 2:
					System.out.println("Employee is part time present!");
					int dailyPartTimeWage = wagePerHour*partTimeHours;
					System.out.println("Daily part time wage is: "+dailyPartTimeWage);
					break;
					
				} 
		}
}
