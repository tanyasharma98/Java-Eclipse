package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDeleteDemo {

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
			
			String sql = "DELETE from jobs where job_id=?";
			
			pst = con.prepareStatement(sql);
			pst.setString(1, jobId);
			
			int rowDeleted = pst.executeUpdate();
			if(rowDeleted == 1) {
				System.out.print("Row Deleted");
			}else {
				System.out.print("Deletion error ");
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
