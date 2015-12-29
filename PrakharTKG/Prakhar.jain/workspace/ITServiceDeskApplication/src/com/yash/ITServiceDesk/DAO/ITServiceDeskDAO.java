package com.yash.ITServiceDesk.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jms.Session;

import com.yash.ITServiceDesk.Util.MyConnection;



public class ITServiceDeskDAO {
	private static Connection connection=null;
	public static void update(String sql){
	connection=MyConnection.getConnection();
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		System.out.println("error");
		e.printStackTrace();
	}
	
	}
	public static String checkUser(String userId){
		connection=MyConnection.getConnection();
		String sql="select userId from user where userId='"+userId+"'";
		String id=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
			id=resultSet.getString(1);	
			}
		} catch (SQLException e) {
			
		}
		return id;
	}
	public static String getSelectName(String sql) {
		connection=MyConnection.getConnection();
		String name=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
			name=resultSet.getString(1);
			}
		} catch (SQLException e) {
		
	}
		return name;
}
}