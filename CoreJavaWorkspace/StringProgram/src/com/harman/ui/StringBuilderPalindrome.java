package com.harman.ui;

import java.util.Scanner;

public class StringBuilderPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder st = new StringBuilder(str);
		st.reverse();
		String rvS = st.toString();
		if(str.equals(rvS)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
