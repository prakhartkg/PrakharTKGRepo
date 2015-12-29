package com.View;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import com.DAO.EmployeeDAO;
import com.Domain.Employee;

public class EmployeePresentationLayer {
	static int no;
	static int empId;
	static String name;
	static String address;

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********************MENU**********************");
		System.out.println("Prass 1. To Add Employee");
		System.out.println("Prass 2. To Remove Person");
		System.out.println("Prass 3. To Display All Employee");
		System.out.println("Prass 4. To Update Data of Employee");
		System.out.println("Prass 5. To Get detail by Id");
		System.out.println("Prass 6. To Exit");
		no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter Employee Address");
			address = sc.next();
			Employee employee = new Employee();
			empId = EmployeeDAO.getId();
			employee.setName(name);
			employee.setAddress(address);
			employee.setEmpId(++empId);
			EmployeeDAO.save(employee);
			break;
		case 2:
			System.out.println("Enter EmployeeId");
			empId = sc.nextInt();
			EmployeeDAO.delete(empId);
			break;
		case 3:
			employee = null;
			System.out.println("List of Employees......");
			List<Employee> list = EmployeeDAO.getEmployee();
			for (Employee emp : list) {
				System.out.println(emp);
			}
			break;
		case 4:
			System.out.println("Enter Employee Id");
			empId = sc.nextInt();
			System.out.println("Enter Changed Name");
			name = sc.next();
			System.out.println("Enter Changed Address");
			address = sc.next();
			EmployeeDAO.updateEmployee(empId, name, address);

			break;
		case 5:
			System.out.println("Enter EmployeeId");
			empId = sc.nextInt();
			System.out.println(EmployeeDAO.getEmployeeById(empId));

			break;
		case 6:
			System.exit(0);
			break;
		}
	}

	public static void main(String[] args) {

		do {
			menu();
		} while (true);

	}

}
