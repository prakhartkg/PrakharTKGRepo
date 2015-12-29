package com.yash.sms.servlets;

import java.io.IOException;
import java.util.List;

import javax.inject.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.sms.domail.Person;
import com.yash.sms.domail.Student;
import com.yash.sms.service.StudentServiceIntf;
import com.yash.sms.service.UserServiceImpl;
import com.yash.sms.service.UserServiceIntf;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	UserServiceIntf userservice;
	@Inject
	StudentServiceIntf studentService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId=request.getParameter("userId");
		String password=request.getParameter("password"); 
		Person person=userservice.validate(Integer.parseInt(userId), password);
		if(person!=null){
		HttpSession session=request.getSession();
		session.setAttribute("Person", person);
		List<Student> students=studentService.showAll();
		session.setAttribute("students", students);
		request.getRequestDispatcher("User.jsp").forward(request, response);
		}else{
			response.sendRedirect("index.jsp");
		}
	}

}
