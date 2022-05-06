package com.harman.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetaDataDemo {

	public static void main(String[] args) throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
		
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverVersion());
		}catch(ClassNotFoundException excep) {
			System.out.println(excep.getMessage());
		}
	}

}
