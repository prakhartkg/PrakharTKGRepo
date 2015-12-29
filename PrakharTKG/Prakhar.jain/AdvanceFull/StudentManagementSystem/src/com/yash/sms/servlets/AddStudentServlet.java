package com.yash.sms.servlets;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.sms.domail.Student;
import com.yash.sms.service.StudentServiceIntf;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Inject
       StudentServiceIntf studentService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student=new Student();
		student.setName(request.getParameter("name"));
		student.setRollNo(Integer.parseInt(request.getParameter("rollNo")));
		student.setContact(request.getParameter("contact"));
		student.setAddress(request.getParameter("address"));
		student.setCourse(request.getParameter("course"));
		studentService.saveStudent(student);
		List<Student> students=studentService.showAll();
		HttpSession session=request.getSession();
		session.setAttribute("students", students);
		response.sendRedirect("User.jsp");
	}

}
