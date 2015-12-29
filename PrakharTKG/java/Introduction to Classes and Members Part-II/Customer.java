public class Customer{   
	private int custId;
	private String custName;
	public static int custCount;
	final static int MAXPHONE=100;  // it should be ststic because without it we can not access it in other class with class name
	public Customer(int custId,String custName)
	{
		this.custId=custId;
		this.custName=custName;
		//MAXPHONE=100;   can not be initialized here because constant must be initialized at the time of memory allocation 
		custCount++;
		System.out.println(custCount);
	
	}
	
	public void print(){
		System.out.println("Customer ID="+custId);
		
		System.out.println("Customer Name="+custName);
	}
	
	protected class Address{    			//public and protected are allowed but not private
		private String city="Indore";
		
		public void print()
		{
		System.out.println("Customer City="+city);
		}
		
	}
	
	protected class Contact{               //public and protected are allowed but not private
		private String mob="9770783435";
		public void print()
		{
		System.out.println("Customer mobile="+mob);
		}
		
	}
}
