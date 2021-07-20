package employeeBridgelabz.com;

	public class Employee {
		// Main method
	
		public static void main(String[] args) {
		
				// Declaring variables
			
				int wagePerHour=20;
				int maximumWorkingDaysPerMonth =20;
				int maximumHoursPerMonth=100;
				
				System.out.println("Welcome to employee wage calculation!");
				/* Generated an integer using random function and if its equal to 1 then employee is full-time
				   present, if its equal to 2 then employee is part-time present and if its 0 then employee is absent */ 
				
				
				int totalEmpHours=0;
				int empHours = 0;
				int totalWorkingDays=0;
				int attendance = (int) Math.floor(Math.random()*10 % 3);
				
				while( totalWorkingDays <= maximumWorkingDaysPerMonth && totalEmpHours < maximumHoursPerMonth) {
					switch(attendance) {
					
					case 0:
						System.out.println("Employee is absent!");;
						empHours=0;
						break;
						
					case 1:
						System.out.println("Employee is full-time present!");
						empHours=8;
						break;
						
					case 2:
						System.out.println("Employee is part-time present!");
						empHours=4;
						break;
						
					}
					totalEmpHours+=empHours;
					totalWorkingDays++;
				}
				 int totalMonthlyEmpWage = totalEmpHours * wagePerHour;
			        System.out.println("Total monthly wage : " + totalMonthlyEmpWage);
		}
}
