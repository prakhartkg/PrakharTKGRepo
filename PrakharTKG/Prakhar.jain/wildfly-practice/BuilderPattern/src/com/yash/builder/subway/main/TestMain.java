package com.yash.builder.subway.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.builder.subway.bread.Bread;
import com.yash.builder.subway.bread.MultiGrainBread;
import com.yash.builder.subway.bread.OraginoBread;
import com.yash.builder.subway.bread.WhiteBread;
import com.yash.builder.subway.sauce.RedChilli;
import com.yash.builder.subway.sauce.Sauce;
import com.yash.builder.subway.sauce.SweetOnion;
import com.yash.builder.subway.sub.Sub;

import com.yash.builder.subway.vegies.Tomato;
import com.yash.builder.subway.vegies.Vegies;

public class TestMain {
	Bread bread;
	
	public void menu(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello sir welcome to Subway............");
		System.out.println("Select Your bread");
		System.out.println("Press 1. to take White bread");
		System.out.println("Press 1. to take Oragino");
		System.out.println("Press 1. to take MultiGrain");
		int breadchoise=sc.nextInt();
			switch (breadchoise) {
			case 1:
				bread=new WhiteBread();
				break;
			case 2:
				bread=new OraginoBread();
				break;
			case 3:
				bread=new MultiGrainBread();
				break;
			default:
				System.out.println("Invalid Input");
				menu();
				break;
			}
		System.out.println("Add Sauce...........");
			do{
				
			}while(true);
	}
	
	public static void main(String[] args) {
		int size=10;
		Bread bread=new WhiteBread();
		List<Vegies>vegies=new ArrayList<>();
		Vegies vegi1=new Tomato();
		Vegies vegi2=new Tomato();
		Vegies vegi3=new Tomato();
		vegies.add(vegi1);
		vegies.add(vegi2);
		vegies.add(vegi3);
		List<Sauce>sauces=new ArrayList<>();
		Sauce sauce=new RedChilli();
		Sauce sauce2=new SweetOnion();
		sauces.add(sauce);
		sauces.add(sauce2);
		Sub sub=new Sub.SubWayBuilder(size,bread,vegies,sauces).create();
		System.out.println(sub.getSize());
		System.out.println(sub.getBread());

	}

}
