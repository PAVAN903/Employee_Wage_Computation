package com.bridgelab;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		Random ran=new Random();
		int FullTime=0;
		int Attendance=ran.nextInt(2);
		if(Attendance==FullTime) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}

}
