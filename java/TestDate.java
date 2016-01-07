package org.company;

public class TestDate{
	
	public static void main(String...args){
		
		MyDate d1=new MyDate(18,9,1967);  
		
		MyDate d2=new MyDate(22,7,2005); 
		
		MyDate d3=new MyDate(d1);
		
		MyDate d4=d1;
		
		MyDate d5; 
		
		d5=d2;	
		
		System.out.println("Date 1: " + d1);
		System.out.println("Date 2: " +d2);
		System.out.println("Date 3: " +d3);
		System.out.println("Date 4: " +d4);
		System.out.println("Date 5: " +d5);
		System.out.println("*****************************************************");
		d5=d2.addDays(60);
		System.out.println("Date 5 + 60 days: "+d5);
		System.out.println("Date 2: " +d2);
		d4=d1.addDays(10);
		System.out.println("Date 4 + 10 days: "+d4);
		
	}
}