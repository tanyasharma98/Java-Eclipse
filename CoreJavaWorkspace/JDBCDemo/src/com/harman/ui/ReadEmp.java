package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadEmp {
	 public static void main(String[] args) throws SQLException {
		 Connection con = null;
			Statement st = null;
			Scanner sc = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
				String sql = "SELECT * from employee_details";
				
				st = con.createStatement();
				
				ResultSet rs = st.executeQuery(sql);
			      
			      while (rs.next())
			      {
			        int id = rs.getInt("Emp_Id");
			        String jobName = rs.getString("Emp_Name");
			        String jobTitle = rs.getString("Emp_Title");
			        int salary = rs.getInt("Emp_Salary");
			        
			        // print the results
			        System.out.format("%s, %s, %s, %s\n", id, jobName, jobTitle, salary);
//				if(count == 1) {
//					System.out.print("Row Updated");
//				}else {
//					System.out.print("Updation error");
//				}
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
