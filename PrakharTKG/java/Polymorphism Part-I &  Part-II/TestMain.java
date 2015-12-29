class Customer {
	protected float discount,amount;
	
	Customer()
	{
		
	}
	
	Customer(float amount)
	{
		this.amount=amount;
		
	}
	
	public float discount(){
		
		discount=0.2f*amount;
		return discount;
	}
	
	public String discount(String location){
		
		discount=0.2f*amount;
		return location;
	}
	
}

class SilverCustomer extends Customer {
	
	public SilverCustomer(float amount)
	{
		this.amount=amount;
		
	}
	public float discount(){
		
		discount=0.3f*amount;
		return discount;
	}
	public String discount(String location){	//Float or other primitive returntype cant be used because the should be in herarchy or in same level of herarchy so we can use String
		
		discount=0.2f*amount;
		return location;
	}
	
	public float parentDiscount()
	{
		System.out.println(super.discount("Indore"));
		return super.discount();
		
	}
	
}

class GoldCustomer extends Customer {
	
	public GoldCustomer(float amount)
	{
		this.amount=amount;
		
	}
	public String discount(String location){
		
		discount=0.2f*amount;
		return location;
	}
	
	public float discount(){
		
		discount=0.4f*amount;
		return discount;
	}
	
	public float parentDiscount()
	{
		return super.discount();
	
	}
}

class TestMain{
	
	public static void main(String...args){
		Customer custc=new Customer(1000);
		System.out.println(custc.discount());
		System.out.println(custc.discount("indore"));
		
		Customer cust1=new SilverCustomer(1000);
		System.out.println(cust1.discount());
		System.out.println(custc.discount("indore"));
		
		Customer cust=new GoldCustomer(1000);
		System.out.println(cust.discount());
		System.out.println(custc.discount("indore"));
		
		//Customer cust1=new SilverCustomer(1000);
		SilverCustomer s=(SilverCustomer)cust1;
		//SilverCustomer s= new SilverCustomer(1000);
		System.out.println(s.parentDiscount());

		
		
	}
}