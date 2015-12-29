class Customer{
	private int custId;
	private String custName;
	Customer(int custId,String custName)
	{
		this.custId=custId;
		this.custName=custName;
	}
	
	public void print(){
		System.out.println("Customer ID="+custId);
		
		System.out.println("Customer Name="+custName);
		
	}
}

class Assignment{
	public static void main(String...args){
		
		Customer cust=new Customer(1,"Ram");
		cust.print();
	}
	
}