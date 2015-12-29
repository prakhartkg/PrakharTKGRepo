package com.yash.ems.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.ems.DBUtil.DBUtil;
import com.yash.ems.Domain.Enquiry;
import com.yash.ems.Domain.User;

public class UserServiceImplementation implements
		UserServiceImplementationInterface {

	public User authentication(String userName, String password) {
		User user = new User();
		String sql = "SELECT * FROM USER WHERE USERNAME='" + userName
				+ "' AND PASSWORD='" + password + "'";
		System.out.println(sql);
		try {
			ResultSet resultSet = DBUtil.select(sql);
			System.out.println(resultSet);
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setEmail(resultSet.getString(3));
				user.setUserName(resultSet.getString(6));
				user.setPassword(resultSet.getString(7));
				user.setType(resultSet.getInt(4));
				user.setStatus(resultSet.getInt(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User register(User user) {
		String sql = "INSERT INTO USER (NAME,EMAIL,TYPE,STATUS,USERNAME,PASSWORD)VALUES('"
				+ user.getName()
				+ "','"
				+ user.getEmail()
				+ "',"
				+ user.getType()
				+ ","
				+ 1
				+ ",'"
				+ user.getUserName()
				+ "','"
				+ user.getPassword() + "')";
		System.out.println(sql);
		DBUtil.Update(sql);
		return null;
	}

	public List<Enquiry> getEnquries(User currentUser) throws SQLException {
		String sql = "SELECT * FROM enquiry where userId="
				+ currentUser.getUserId();
		ResultSet resultSet = DBUtil.select(sql);
		List<Enquiry> users = new ArrayList<>();
		while (resultSet.next()) {
			Enquiry user = new Enquiry();
			user.setEnquireId(resultSet.getInt(1));
			user.setContact(resultSet.getString(5));
			user.setName(resultSet.getString(2));
			user.setEmail(resultSet.getString(4));
			user.setCourse(resultSet.getString(6));
			users.add(user);
		}
		return users;
	}

	@Override
	public List<Enquiry> Delete(int id, User currentUser) {
		String sql = "Delete from enquiry where enquireId=" + id;
		DBUtil.Update(sql);
		List<Enquiry> users = new ArrayList<>();
		try {
			users = getEnquries(currentUser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<Enquiry> AddEnquiry(String name, String email, String contact,
			User user, String course) {
		String sql = "INSERT INTO enquiry (NAME,USERID,EMAIL,CONTACT,COURSE)VALUES('"
				+ name
				+ "',"
				+ user.getUserId()
				+ ",'"
				+ email
				+ "','"
				+ contact + "','" + course + "')";
		System.out.println(sql);
		List<Enquiry> enquiries = new ArrayList<>();
		DBUtil.Update(sql);
		try {
			enquiries = getEnquries(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enquiries;
	}

}
