package com.harman.ui;

import java.sql.DriverManager;
import java.lang.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName(jdbc:mysql://localhost:3306/?user=root)
			DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb", "root", "root");
//			System.out.println("connection established");)
		} catch (ClassNotFoundexception excep) {
			
		}
	}

}
