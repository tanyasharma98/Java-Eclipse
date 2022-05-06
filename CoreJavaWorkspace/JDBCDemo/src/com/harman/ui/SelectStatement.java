package com.harman.ui;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			String sql = "SELECT * from jobs";
			
			st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
		      
		      // iterate through the java resultset
		      while (rs.next())
		      {
		        String id = rs.getString("job_id");
		        String jobTitle = rs.getString("job_title");
		        int minimumSalary = rs.getInt("min_Salary");
		        int maximumSalary = rs.getInt("max_Salary");
		        
		        // print the results
		        System.out.format("%s, %s, %s, %s\n", id, jobTitle, minimumSalary, maximumSalary);
//			
//			if(count == 1) {
//				System.out.print("Row Updated");
//			}else {
//				System.out.print("Updation error");
//			}
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
