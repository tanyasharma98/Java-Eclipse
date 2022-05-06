package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			String sql = "UPDATE jobs set job_title='new' where job_id='j3'";
			
			st = con.createStatement();
			
			int count = st.executeUpdate(sql);
			
			if(count == 1) {
				System.out.print("Row Updated");
			}else {
				System.out.print("Updation error");
			}
		}catch(ClassNotFoundException excep) {
			System.out.println("Not Found");
		}finally {
			try {
				st.close();
				con.close();
			}catch(SQLException exp) {
				System.out.println(exp.getMessage());
			}
		}
	}
}
