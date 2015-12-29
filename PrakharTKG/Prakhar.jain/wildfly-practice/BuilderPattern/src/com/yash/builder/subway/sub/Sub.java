package com.yash.builder.subway.sub;

import java.util.ArrayList;
import java.util.List;

import com.yash.builder.subway.bread.Bread;
import com.yash.builder.subway.sauce.Sauce;
import com.yash.builder.subway.vegies.Vegies;

public class Sub {
	private int size;
	private Bread bread;
	private List<Vegies>vegies;
	private List<Sauce>sauces;
	
	
	public Sub(SubWayBuilder builder) {
		super();
		this.size = builder.size;
		this.bread = builder.bread;
		this.vegies = builder.vegies;
		this.sauces = builder.sauces;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Bread getBread() {
		return bread;
	}
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	public List<? extends Vegies> getList() {
		return vegies;
	}
	public void setList(List<Vegies> vegies) {
		this.vegies = vegies;
	}
	public List<? extends Sauce> getSauces() {
		return sauces;
	}
	public void setSauces(List<Sauce> sauces) {
		this.sauces = sauces;
	}
	
	public static class SubWayBuilder{
		private int size;
		private Bread bread;
		private List<Vegies>vegies=new ArrayList<>();
		private List<Sauce>sauces=new ArrayList<>();
		
		
		
		public SubWayBuilder(int size, Bread bread, List<Vegies> vegies, List<Sauce> sauces) {
			super();
			this.size = size;
			this.bread = bread;
			this.vegies = vegies;
			this.sauces = sauces;
		}



		public Sub create(){
			Sub sub=new Sub(this);
			return sub;
		}
		
	}
	
}
