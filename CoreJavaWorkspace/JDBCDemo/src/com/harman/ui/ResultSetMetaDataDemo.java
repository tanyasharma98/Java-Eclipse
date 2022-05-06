package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
		
		PreparedStatement pst = con.prepareStatement("SELECT * from jobs");
		ResultSet rs = pst.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));

		}catch(ClassNotFoundException exp) {
			System.out.println(exp.getMessage());
		}
	}

}
