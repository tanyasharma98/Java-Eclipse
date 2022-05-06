package com.harman.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.harman.bean.Employee;
import com.harman.service.EmployeeRowMapper;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(Employee employee) {
		String sql = "insert into employees (employee_name, email, gender, salary) values (?,?,?,?)";
		int count = jdbcTemplate.update(sql, new Object[] { employee.geteName(), employee.getEmail(), employee.getGender(), employee.getSalary()});
		if (count == 1)
			System.out.println("employee created");

	}

	public Employee getEmployeeById(int eId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById1(int employeeId) {
		String sql = "select * from employees where employee_id = ?";
		Employee employee = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(),employeeId );
		return employee;
	
	}
	
	public List<Employee> getAllEmployees() {
		String sql = "select * from employees";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}

}
//		Connection con = null;
//		PreparedStatement ps = null;
//		
//		try {
//			con = dataSource.getConnection();
//			String sql = "insert into employees(employee_name , email, salary , gender) values(?,?,?,?)";
//			ps = con.prepareStatement(sql);
//			ps.setString(1, employee.geteName());
//			ps.setString(2, employee.getEmail());
//			ps.setDouble(3, employee.getSalary());
//			ps.setString(4, employee.getGender());
//			
//			int count =ps.executeUpdate();
//			if(count > 0) {
//				System.out.println("Employee Created");
//			}
//		}catch (Exception exp) {
//			System.out.println(exp.getMessage());
//		}finally {
//			if(con !=null) {
//				try {
//					con.close();
//				}catch (SQLException exp) {
//					System.out.println(exp.getMessage());
//				}
//			}
//		}
//		
//	}
//
//	public Employee getEmployeeById(int eId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<Employee> getAllEmployees() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
