package com.harman.ui;

public class LeapYear {
	public static void main(String[] args) {
		//If Any year divisible by 400 is a leap year
		//Else If divisible by 4 AND not divisible by 100 then a a leap year
		// else not a leap year
		int year = 2400;
		
		if(year%400==0) {
			System.out.println(year + " = Leap Year");
		}else if(year%4==0 && year%100!=0) {
			System.out.println(year + " = Leap Year");
		}else {
			System.out.println(year + " = Not a Leap Year");
		}
	}
}
