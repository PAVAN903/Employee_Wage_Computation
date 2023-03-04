package com.bridgelab;

import java.util.Random;

public class EmployeeWageComputation {
	public static void Compute() {
		Random ran = new Random();
		int FullTime = 0;
		int empHr = 0;
		int wagePerHour = 20;
		int totalworkingday = 20;
		int totalwage = 0;
		int totalworkingHour = 100;
		int Attendance = ran.nextInt(3);
		switch (Attendance) {
		case 1:
			System.out.println("Employee is Present");
			empHr = 8;
			int dailyWage = empHr * wagePerHour;
			System.out.println("Employee daily wage:: " + dailyWage);
			break;
		case 2:
			System.out.println("Employee is Part Time");
			empHr = 4;
			int dailyWagePart = empHr * wagePerHour;
			System.out.println("Employee part time daily wage:: " + dailyWagePart);
			break;
		default:
			System.out.println("Employee is Absent");
			empHr = 0;
			break;

		}
		int dailyWage = empHr * wagePerHour;
		int totalworkinghour = wagePerHour * totalworkingHour;
		System.out.println("total wage for 100 working hour is:: " + totalworkinghour);
		int totalworkday = totalworkingday * dailyWage;
		System.out.println(" wage for 20 working day is:: " + totalworkday);
		int Monthlywage = totalworkinghour + totalworkday;
		System.out.println("montly wage for 100 hour and 20 work day is: " + Monthlywage);
	}
	public static void main(String[] args) {
		System.out.println("welcome to employee wage computation");
		EmployeeWageComputation.Compute();
	}
}