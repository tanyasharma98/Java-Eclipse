package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


// PreparedStatement --- support parameterized query
public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		Scanner sc = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			sc = new Scanner(System.in);
			System.out.print("Enter job id : ");
			String jobId = sc.nextLine();
			System.out.print("Enter job title : ");
			String jobTitle = sc.nextLine();
			System.out.print("Enter minimu salary : ");
			int minSalary = sc.nextInt();
			System.out.print("Enter maximum salary : ");
			int maxSalary = sc.nextInt();
			
			String sql = "INSERT INTO jobs (job_id , job_title, min_salary, max_salary) VALUES (?,?,?,?)";
			
			pst = con.prepareStatement(sql);
			pst.setString(1, jobId);
			pst.setString(2, jobTitle);
			pst.setInt(3, minSalary);
			pst.setInt(4, maxSalary);
			
			int rowInserted = pst.executeUpdate();
			if(rowInserted == 1) {
				System.out.print("Row Inserted");
			}else {
				System.out.print("Insertion error ");
			}
		}catch(ClassNotFoundException excep) {
			System.out.println("Not Found");
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}finally {
			sc.close();
			try {
				pst.close();
			}catch(SQLException exp) {
				System.out.println(exp.getMessage());
			}
			try {
				con.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
