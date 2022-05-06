package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmp {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		Scanner sc = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			sc = new Scanner(System.in);
			System.out.print("Enter job id : ");
			int empId = sc.nextInt();
			System.out.print("Enter job title : ");
			String empTitle = sc.nextLine();
			
			String sql = "UPDATE employee_details SET Emp_Title=? where Emp_Id=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, empTitle);
			pst.setInt(2, empId);
			
			int rowUpdated = pst.executeUpdate();
			if(rowUpdated == 1) {
				System.out.println("Rows Updated");
			}else {
				System.out.println("Updation Error");
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
