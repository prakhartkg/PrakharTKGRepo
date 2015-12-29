import java.util.*;
class Customer {
	private int accno;
	private String name;
	Scanner sc= new Scanner(System.in);
	Customer(String name,int accno){
	this.name=name;
	this.accno=accno;
	}
public String getName(){
	return name;
	
}
public int getacno(){
	return accno;
	
}
}



class CustomerSort implements Comparator{
	
	public int compare(Object o1, Object o2){
		Customer c1=(Customer)o1;
		Customer c2=(Customer)o2;
		
	return c1.getName().compareTo(c2.getName());
	}	
}

class CheckNo extends RuntimeException{
		
	CheckNo(){
		 System.out.println("Invalid No.");

	 } 
	
	}


class Test1{
	
	static int i=0;
	public static void main(String...args){
		int no;
		
		Scanner sc= new Scanner(System.in);
		
		Customer[] obj=new Customer[100];
		do{
		
		System.out.println("********************MENU**********************");
		System.out.println("Prass 1. For adding Benf");
		System.out.println("Prass 2. For Show");
		System.out.println("Prass 3. To exit ");
		no=sc.nextInt();
		switch(no){
			case 1:
			try{
					System.out.println("Enter Name");
					String name=sc.next();
					System.out.println("Enter Account No");
					int  accno=sc.nextInt();
					obj[i]=new Customer(name,accno);
					i++;
				}
				catch(Exception c)
				{
					new CheckNo();
				}
			break;
			case 2:
			Arrays.sort(obj,new CustomerSort());
			System.out.println("Account no.         Name");
			for(int j=0;j<i;j++)
			{
				
				System.out.printf("%-20d %s",obj[j].getacno(),obj[j].getName());
				System.out.println();
			}
			System.out.println("*************************************************************************");
			break;
			case 3:
			System.exit(0);
			break;
			default:
			System.out.println("Invalid option"); 
					
		}	
		}
		while(true);
	}
}