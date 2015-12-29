package com.yash.resumeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.resumeapp.util.util;

public class CandidateDao {
	

	public static ResultSet select(String sql) throws SQLException {
		Connection connection = util.getConnection();
		System.out.println(connection);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		System.out.println(resultSet);
		return resultSet;

	}

	

	public static void Update(String sql) {
		Connection connection = util.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
		
}
