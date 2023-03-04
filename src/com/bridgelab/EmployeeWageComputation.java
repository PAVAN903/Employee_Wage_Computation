package com.bridgelab;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		Random ran=new Random();
		int FullTime=0;
		int empHr=0;
		int wagePerHour=20;
		int Attendance=ran.nextInt(2);
		if(Attendance==FullTime) {
			System.out.println("Employee is Present");
			empHr=8;
			int dailyWage=empHr*wagePerHour;
			System.out.println("Employee daily wage:: "+dailyWage);
			}else {
			System.out.println("Employee is Absent");
			empHr=0;
		}
	}

}
