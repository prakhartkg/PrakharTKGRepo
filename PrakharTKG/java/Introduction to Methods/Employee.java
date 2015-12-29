public class Employee{ 
private int empId;
static int empCount;

	public void setEmpId(int empId ){
		this.empId=empId;
	}
	
	public int getEustId(){
		return empId;
	}
	
	public void print(){
	System.out.println(empId);	
		
	}
	static int incriment()
	{
		empCount++;
		return empCount;
	}
	
	void print(String...st){
		String s=" ";
		for(String i:st)
		{
			s+=i;
			
		}
		System.out.println(s);
		
	}
		
}