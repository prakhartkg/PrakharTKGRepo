package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Domain.Employee;
import com.util.EstablishConnection;

public class EmployeeDAO {
	static Scanner sc = new Scanner(System.in);

	public static int getId() {
		int id = -1;
		Connection connection = EstablishConnection.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select max(empId) from employee");
			while (rs.next()) {
				id = rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("invalid");
		}
		return id;

	}

	public static void save(Employee employee) {
		Connection connection = EstablishConnection.getConnection();
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		try {
			PreparedStatement psmt = connection.prepareStatement(sql);
			psmt.setInt(1, employee.getEmpId());
			psmt.setString(2, employee.getName());
			psmt.setString(3, employee.getAddress());
			int i = psmt.executeUpdate();
		} catch (SQLException e) {

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void delete(int empId) {
		Connection connection = EstablishConnection.getConnection();
		String sql = "DELETE FROM EMPLOYEE WHERE empId=?";
		try {
			PreparedStatement psmt = connection.prepareStatement(sql);
			psmt.setInt(1, empId);
			int i = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Employee> getEmployee() {

		List<Employee> list = new ArrayList<Employee>();
		Connection connection = EstablishConnection.getConnection();
		String sql = "SELECT * FROM EMPLOYEE";
		try {
			PreparedStatement psmt = connection.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				list.add(new Employee(id, name, address));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	public static void updateEmployee(int id, String name, String address) {
		String sql = "UPDATE EMPLOYEE SET name=? , address=? WHERE empId=?";
		Connection connection = EstablishConnection.getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, address);
			psmt.setInt(3, id);
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Employee not updated");
		}

	}

	public static Employee getEmployeeById(int empId) {
		Connection connection = EstablishConnection.getConnection();
		String sql = "SELECT * FROM EMPLOYEE where empId=?";
		try {
			PreparedStatement psmt = connection.prepareStatement(sql);
			psmt.setInt(1, empId);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				return new Employee(id, name, address);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

}
