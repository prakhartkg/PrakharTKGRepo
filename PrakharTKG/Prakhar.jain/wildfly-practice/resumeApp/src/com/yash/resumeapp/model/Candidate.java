package com.yash.resumeapp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Candidate {
	private int id;
	private String name;
	private String city;
	private Marks marks=new Marks();
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
}
