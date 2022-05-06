package com.harman.ui;

import java.io.File;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter path and File name");
		String path = sc.next();
		
		File file = new File(path);
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println("This file is of " + file.length() + "bytes in size");
			}else {
				System.out.println("The file present in the folder are :");
				File[] files = file.listFiles();
				for(File currentFile : files) {
					System.out.println(currentFile.getName()+"\t"+(
							currentFile.isDirectory() ? "<DIR>" :"FILE") +"\t"+
							(currentFile.length())+ "bytes" +"\t" );
					
				}
			}
		}else {
			System.out.println("File or Path not found");
		}
		sc.close();
	}

}
