package com.harman.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.harman.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.seteId(rs.getInt("employee_id"));
		employee.seteName(rs.getString("employee_name"));
		employee.setEmail(rs.getString("email"));
		employee.setGender(rs.getString("gender"));
		employee.setSalary(rs.getDouble("salary"));
		return employee;
	}

}
