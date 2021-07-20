package employeeBridgelabz.com;

	public class Employee {
		
				// Declaring variables
				
				static final int wagePerHour=20;
				static final int maximumWorkingDaysPerMonth =20;
				static final int  maximumHoursPerMonth=100;
				
				//Method to calculate monthly wage
				
				public void computeWage() {
					int totalEmpHours=0;
					int empHours = 0;
					int totalWorkingDays=0;
					
					/* Generated an integer using random function and if its equal to 1 then employee is full-time
					   present, if its equal to 2 then employee is part-time present and if its 0 then employee is absent */ 
					
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
				
				// Main method
				public static void main(String[] args) {
					
					System.out.println("Welcome to employee wage calculation!");
					//Created a Employee class object and calling the predefined method
					
					Employee employee = new Employee();
					employee.computeWage();
				}
}
