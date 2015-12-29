
public class Assignment2{
	public static void main(String...args){
		
		/*Customer cust=new Customer(1,"Ram");
		cust.print();
		Customer.Address add=cust.new Address();
		add.print();
		Customer.Contact cont=cust.new Contact();
		cont.print();
		
		Customer cust =new Customer(1,"Ram");
		System.out.println(cust.a);       //  default members are not accessed outside package 
			System.out.println(cust.b);
		//		System.out.println(cust.c);    //private maembers are not allowed to access in other class or outside the package;
 					System.out.println(cust.d);   // protected members are not acessed outside the package
	
	*/
	Customer cust=new Customer(1,"Ram");
	Customer cust1=new Customer(1,"Ram");
	System.out.println(cust.custCount);
	System.out.println(Customer.custCount);
		System.out.println(cust.MAXPHONE);
	System.out.println(Customer.MAXPHONE);
	
	}
	
}