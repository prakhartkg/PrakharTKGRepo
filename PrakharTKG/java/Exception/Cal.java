
// interface assignment 1 2 and 3
import java.io.*;

interface Calculator{
	int result=4;
	void sum();
	void sub();
	void div();
	void mul();
	
}

interface ScCal{
	void m1();
	void m2();
}
class MainCal implements Calculator,ScCal{
	int a=10,b=5,c;
	public void sum(){
		c=a+b;
		System.out.println(result);
	}
	public void sub(){
		c=a-b;
	}
	public void div(){
		c=a/b;
	}
	public void mul(){
		c=a*b;
	}
	public void m1(){
		System.out.println("M1");
	}
	public void m2(){
		System.out.println("m2");
	}
	
	public float doCal(int iVal){
	
		return 100/iVal;
		
	}
	// gives un reported exception
	public void save()
	{
		try{
		FileOutputStream fout = new FileOutputStream("I:\\emp.text");
		}catch(FileNotFoundException fe)
		{
			
			System.out.println("File Not found");
		}
	}
	
}




class Cal{
	public static void main(String...args){
		MainCal m = new MainCal();
		Calculator cl;
		//System.out.println(c1);
		// x = new Calculator();  		// cannot make an object of interfacez
		//c1.sum();
		m.sum();
		m.sub();
		m.div();
		m.mul();
		m.m1();
		m.m2();	
		System.out.println(m.doCal(20));
		m.save();      // 
		//System.out.println(m.doCal(0));   this statement will generate arithmetic exception at runtime / by 0 
		
		try{
			
			float f=m.doCal(1);
				String str=args[2];
		}catch(ArithmeticException e)  //arithmetic exception thrown
		{
			
			System.out.println("Divided by zero:::"+e);
		}
		catch(ArrayIndexOutOfBoundsException e1){    // arrayendexoutofbound exception thrown
			System.out.println("Index out of bound");
			
		}
		
		finally{
			
			
			System.out.println("Finally block");
		}
		/*if I remove try catch then compile successfully 
		float f=m.doCal(0);
		String str=args[2];
		*/
	}
}
