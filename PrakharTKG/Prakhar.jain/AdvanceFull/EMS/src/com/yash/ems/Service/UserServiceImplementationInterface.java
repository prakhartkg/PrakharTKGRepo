package com.yash.ems.Service;

import java.sql.SQLException;
import java.util.List;

import com.yash.ems.Domain.Enquiry;
import com.yash.ems.Domain.User;

public interface UserServiceImplementationInterface {
	public User authentication(String userName,String password);
	public User register(User user);
	public List<Enquiry> getEnquries(User user) throws SQLException;
	public List<Enquiry> Delete(int i, User currentUser);

	public List<Enquiry> AddEnquiry(String name, String email, String contact,
			User user, String course);
}
