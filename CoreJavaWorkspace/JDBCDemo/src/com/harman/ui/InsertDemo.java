package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// Connection Interface

public class InsertDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			String sql = "INSERT INTO jobs(job_id , job_title, min_salary, max_salary) VALUES('j1', 'Netemp', '20000','50000')";
			
			st = con.createStatement();
			
			int count = st.executeUpdate(sql);
			
			if(count == 1) {
				System.out.print("Row Inserted");
			}else {
				System.out.print("Insertio error");
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
