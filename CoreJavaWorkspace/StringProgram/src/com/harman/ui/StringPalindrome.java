package com.harman.ui;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int left = 0, right = str.length()-1;
		boolean isPalindrome = true;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome== true) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
