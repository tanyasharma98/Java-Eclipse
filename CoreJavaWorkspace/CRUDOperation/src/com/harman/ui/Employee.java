package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
public static void main(String[] args) throws SQLException {
	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	Scanner sc = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
		
		System.out.println("Enter 1:Create\n Enter 2:Update\n Enter 3:Read\n Enter 4:Delete");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==1) {
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
		}
		else if(n==2) {
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
		}
		}
		else if(n==3) {
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
		}
		else if(n==4) {
			sc = new Scanner(System.in);
			System.out.print("Enter Emp id : ");
			int empId = sc.nextInt();
			
			String sql = "DELETE from employee_details where Emp_Id=?";
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, empId);
			
			int rowDeleted = pst.executeUpdate();
			if(rowDeleted == 1) {
				System.out.print("Row Deleted");
			}else {
				System.out.print("Deletion error ");
			}
		}
		else {
			System.out.println("Execute Program Again");
		}
	}catch(ClassNotFoundException excep) {
		System.out.println("Not Found");
	}catch(SQLException exp) {
		System.out.println(exp.getMessage());
	}finally {
		System.out.println("Hello");
		
	}

}
}
