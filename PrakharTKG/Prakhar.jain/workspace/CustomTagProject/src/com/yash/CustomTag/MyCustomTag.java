package com.yash.CustomTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{
	private static final long serialVersionUID = 1L;
	private String action;
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public int doStartTag() throws JspException {
		try {

			JspWriter out = pageContext.getOut();	
			out.println("<form action=frontControllerServlet>");
			out.println("<table>");
			out.println("<tr><td>Enter Name:</td><td><input type=\"text\" name=\"name\"></td></tr>");
			out.println("<tr><td>Enter City:</td><td><input type=\"text\" name=\"city\"></td></tr>");
			out.println("<tr><td>Enter Age:</td><td><input type=\"text\" name=\"age\"></td></tr>");
			out.println("<tr><td colspan=2></td><td><input type=\"submit\" value=\"Submit\"></td></tr>");
			out.println("</table>");
			out.println("</form>");
			
		} catch (Exception ioException) {
			System.err.println("IO Exception");
			System.err.println("ioException.toString()");
		}
		return SKIP_BODY;
	}
	

}
