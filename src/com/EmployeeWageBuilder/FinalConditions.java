package com.EmployeeWageBuilder;

public class FinalConditions 
{
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HR = 20;
		public static final int MAX_WORKING_DAYS = 20;
		public static final int MAX_WORKING_HOURS = 100;
		public static void main(String[] args) 
		{
			int totalWorkingHrs = 0;
			int totalWorkingDays = 0;
			int empHrs = 0;
			while((totalWorkingHrs<MAX_WORKING_HOURS) && (totalWorkingDays<MAX_WORKING_DAYS))
			{
				int empCheck =(int) ((Math.random())*10)%3;
				System.out.println(+empCheck);
				switch(empCheck)
				{
				case IS_FULL_TIME:
					System.out.println("Full Time Employee");
					empHrs = 8;
					break;
				case IS_PART_TIME:
					System.out.println("Part Time Employee");
					empHrs = 4;
					break;
				default:
					System.out.println("Employee is Absent");
					empHrs = 0;
					break;
				}
				totalWorkingHrs=totalWorkingHrs+empHrs;
				totalWorkingDays++;
				System.out.println("Total Working Hours = "+totalWorkingHrs);
				System.out.println("Day = "+totalWorkingDays);
				int dailyWage = empHrs*EMP_RATE_PER_HR;
				System.out.println("Employee Daily Wage is: "+dailyWage);
				int totalWage = totalWorkingHrs*EMP_RATE_PER_HR;
				System.out.println("Total Wage is: "+totalWage);		
			}
	}
}
