package com.harman.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = sc.nextLine();
		
		try {
		FileReader fr = new FileReader(fileName);
		int ch;
		while(true) {
		ch = fr.read();
		if(ch == -1) {
			break;
		}
		System.out.print((char)ch);
		}
		}catch(FileNotFoundException exp) {
			System.out.println(exp.getMessage());
		}catch(IOException exp) {
			System.out.println("Could not read File");
		}
}
}
