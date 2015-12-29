package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerilization{
	public static void main(String[] args) {
		Employee employee= Employee.getInstance();
		employee.setCount(2);
		employee.setEmp_id(1);
		employee.setName("Prakhar");
		System.out.println(employee);
		try {
			FileOutputStream fout = new FileOutputStream("d:\\abc.ser");
			ObjectOutputStream oos;
			try {
				oos = new ObjectOutputStream(fout);
				oos.writeObject(employee);
				oos.close();
			} catch (IOException e) {
				
			}   
			
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			
		}
		

		 FileInputStream fin;
		try {
			fin = new FileInputStream("d:\\abc.ser");
			 ObjectInputStream ois;
			try {
				ois = new ObjectInputStream(fin);
				try {
					Employee employee1 = (Employee) ois.readObject();
					System.out.println(employee1.getCount());
					System.out.println(employee1.getName());
					System.out.println(employee1);
				} catch (ClassNotFoundException e) {
				
				}
				ois.close();
				
			} catch (IOException e) {
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	
	
	}
	
	
	
}
