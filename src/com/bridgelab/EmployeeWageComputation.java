package com.bridgelab;

import java.util.Random;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		Random ran = new Random();
		int FullTime = 0;
		int empHr = 0;
		int wagePerHour = 20;

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
	}
}