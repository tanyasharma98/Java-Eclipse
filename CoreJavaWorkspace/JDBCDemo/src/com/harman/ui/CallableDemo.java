package com.harman.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			CallableStatement cs = con.prepareCall("{? = call sqrt( ? )}");
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setInt(2, 36);
			cs.execute();
			
			String output = cs.getString(1);
			System.out.println("Square root of  = " + output);
		}catch(SQLException exp) {
			System.out.println("unable to connect");
		}

	}

}
