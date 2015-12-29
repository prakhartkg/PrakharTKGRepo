public class Customer{    // private and protected access modifier cant be allowed because other class Assicnment2 is accessing this class so it should be public  
	private int custId;
	private String custName;
	int a=10;
	public int b=20;
	private int c=30;   //  private maembers are not allowed to access in other class
	protected int d=40;
	Customer(int custId,String custName)
	{
		this.custId=custId;
		this.custName=custName;
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
