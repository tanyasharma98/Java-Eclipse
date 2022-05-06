package com.harman.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelectDemo {

	public static void main(String[] args) {
		
		String sql = "SELECT job_id, job_title FROM jobs";
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harmandb","root" ,"root");
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs= pst.executeQuery();
				){
			String jobId , jobTitle;
			while(rs.next()) {
				jobId = rs.getString(1);
				jobTitle = rs.getString(2);
				//System.out.printf("%-15s%-10s\n", jobId , jobTitle);
				//System.out.println(jobId +"  "+jobTitle +" ");
			}
		}catch(SQLException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
