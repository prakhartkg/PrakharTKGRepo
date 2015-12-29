public class Assignment2{
	public static void main(String...args){
		
		/*Customer cust=new Customer(1,"Ram");
		cust.print();
		Customer.Address add=cust.new Address();
		add.print();
		Customer.Contact cont=cust.new Contact();
		cont.print();
		*/
		Customer cust =new Customer(1,"Ram");
		System.out.println(cust.a);
			System.out.println(cust.b);
				//System.out.println(cust.c);    private maembers are not allowed to access in other class 
 					System.out.println(cust.d);
	
	}
	
}