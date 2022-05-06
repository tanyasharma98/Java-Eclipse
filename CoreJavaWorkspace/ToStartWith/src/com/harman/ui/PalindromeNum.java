package com.harman.ui;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int reverseNum =0;
		while(temp != 0) {
			int rem = temp%10;
			reverseNum = reverseNum*10 + rem;
			temp /=10;
		}
		if(n== reverseNum) {
			System.out.println(n +" is a Palindrome");
		}else {
			System.out.println(n +" is not a Palindrome");
		}
	}

}
