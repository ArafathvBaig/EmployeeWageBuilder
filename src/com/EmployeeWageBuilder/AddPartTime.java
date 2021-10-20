package com.EmployeeWageBuilder;

public class AddPartTime {

	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;
		int empHrs = 0;
		double empCheck = Math.floor(Math.random()*10)%2;
		//int empCheck = (int)(Math.random()*10)%2;
		System.out.println(+empCheck);
		if(empCheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");
			double empCheck1 = Math.floor(Math.random()*10)%2;
			if(empCheck1==IS_FULL_TIME)
			{
				empHrs = 8;				
			}
			else
			{
				empHrs = 4;
			}
		}
		else 
		{
			empHrs = 0;
			System.out.println("Employee is Absent");
		}
		int empWage = empHrs*EMP_RATE_PER_HR;
		System.out.println("Employee Daily Wage is: "+empWage);	

	}

}
