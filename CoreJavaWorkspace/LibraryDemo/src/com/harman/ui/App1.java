package com.harman.ui;

public class App1 {

	public static void main(String[] args) {
		// Bad program as we are not following coding standards
		try {
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		int result;
		
		result = firstNumber + secondNumber;
		System.out.println("Sum = "+ result);
		
		result = firstNumber - secondNumber;
		System.out.println("Difference = "+ result);

		result = firstNumber * secondNumber;
		System.out.println("Multiplication = "+ result);
		
		//Exception  stack trace
		try {
		result = firstNumber / secondNumber;	
		System.out.println("Division = "+ result);
		} catch (ArithmeticException exp) {
			System.out.println("Denominator can't be zero");		}
		} catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("No Arguments in command line");
		}
	}

}
