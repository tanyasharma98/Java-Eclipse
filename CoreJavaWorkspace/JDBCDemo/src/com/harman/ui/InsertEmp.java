package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmp {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		Scanner sc = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			sc = new Scanner(System.in);
			System.out.println("Enter Emp Id");
			int empId = sc.nextInt();
			System.out.println("Enter Emp Name");
			String empName = sc.nextLine();
			System.out.println("Enter Emp Title");
			String empTitle = sc.nextLine();
			System.out.println("Enter Salary");
			int empSalary = sc.nextInt();
			
			
			String sql = "INSERT INTO employee_details (Emp_Id, Emp_Name, Emp_title , Emp_Salary) VALUES (?,?,?,?)";
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setString(3, empTitle);
			pst.setInt(4, empSalary);
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
		}finally{
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


