package com.yash.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TestTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	private String text = "Hello World By My Own Tag";
	private String color = "red";

	public void setText(String value) {
		System.out.println("----------------------setter---------------------");
		this.text = value;
	}

	public void setColor(String value) {
		this.color = value;
	}
	
	public int doStartTag() throws JspException {
		try {

			JspWriter out = pageContext.getOut();
			out.println("<Font color=" + color + ">" + text + "</Font>");
		} catch (Exception ioException) {
			System.err.println("IO Exception");
			System.err.println("ioException.toString()");
		}
		return SKIP_BODY;
	}

}
