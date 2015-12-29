public class Excep6{
	public static int factorial(int no){
	   if(no!=1)
	   return factorial(no*(no-1));
	   return 1;
		 
   }
   public static void main(String...args){
	 int no=5;
	 no=no*factorial(no);
		
	  System.out.println(no);
   }
}