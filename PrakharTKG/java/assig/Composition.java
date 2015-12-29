import java.util.Scanner;

class Student{
	int rollNo;
	String name;
	Address add;    // object of address class
	Scanner sc=new Scanner(System.in);
	Student()
	{
		System.out.println("Enter RollNo");
		rollNo=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		add=new Address();
	}
	
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("RollNo="+rollNo);
		System.out.println("HouseNo="+add.houseNo);
		System.out.println("Street="+add.street);
		System.out.println("city="+add.city);
	}
}

class Address{
	
	int houseNo;
	String street;
	String city;
	Scanner sc=new Scanner(System.in);
	
	Address(){
		System.out.println("Enter HouseNo");
		houseNo=sc.nextInt();
		System.out.println("Enter street");
		street=sc.next();
		System.out.println("Enter city");
		city=sc.next();
	}
} 

class Composition{
	
	public static void main(String ...args){
		
		Student s=new Student();
	
		s.display();
		
		//Address a = new Address();
	}
}