package com.yash.ems.Domain;

public class Enquiry extends Person {
	private int enquireId;
	private String contact;
	private String course;

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getEnquireId() {
		return enquireId;
	}

	public void setEnquireId(int enquireId) {
		this.enquireId = enquireId;
	}

}
