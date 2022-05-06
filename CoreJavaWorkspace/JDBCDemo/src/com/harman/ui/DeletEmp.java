package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletEmp {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement pst = null;
		Scanner sc = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			sc = new Scanner(System.in);
			System.out.print("Enter Emp id : ");
			int empId = sc.nextInt();
			String sql = "DELETE from employee_details where Emp_Id=?";
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, empId);
			
			int rowDeleted = pst.executeUpdate();
			if(rowDeleted == 1) {
				System.out.println("Row Deleted");
			}else {
				System.out.println("Deletion error ");
			}
		}catch(ClassNotFoundException excep) {
			System.out.println("Not Found");
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}finally {
			System.out.println("Done");
			
	}


	}

}
