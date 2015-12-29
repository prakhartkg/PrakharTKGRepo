package com.exception;

class A{
	public void show(){
		System.out.println("Hello");
	}
}

public class TestWait {
public static void main(String[] args) {
	A a=new A();
	try {
		a.show();
		a.wait(10000);
		a.show();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
