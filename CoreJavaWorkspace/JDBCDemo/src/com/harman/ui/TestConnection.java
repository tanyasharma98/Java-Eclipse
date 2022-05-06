package com.harman.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		try {
			//Copied from the website that's why we will get error message ---just add cj
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
		System.out.print("Connection Established");
		}catch(ClassNotFoundException e){
			System.out.print("NOt found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("SQL Exception found");
		}
	}

}
