package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


//Statement Interface

public class Insert2 {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		Scanner sc = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
			
			sc = new Scanner(System.in);
			System.out.print("Enter job id : ");
			String jobId = sc.nextLine();
			System.out.print("Enter job title : ");
			String jobTitle = sc.nextLine();
			System.out.print("Enter minimum salary : ");
			int minSalary = sc.nextInt();
			System.out.print("Enter maximum salary : ");
			int maxSalary = sc.nextInt();
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO jobs (job_id, job_title, min_salary, max_salary) VALUES('");
			sql.append(jobId);
			sql.append("','");
			sql.append(jobTitle);
			sql.append("',");
			sql.append(minSalary);
			sql.append(",");
			sql.append(maxSalary);
			sql.append(")");
			
			st = con.createStatement();
			int count = st.executeUpdate(sql.toString());
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


