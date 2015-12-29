import java.util.*;


public class ArrayToCollection{
   public static void main(String args[]) 
   {
      Scanner sc=new Scanner(System.in);
      String[] name = new String[3];
      for(int i = 0; i < 3; i++){
         name[i] = sc.next();
      }
       list = Arrays.asList(name); 
	  
      System.out.println();
      Iterator itr=list.iterator();
	  while(itr.hasNext()){
		  String str=(String)itr.next();
		System.out.println(str+" ");
	  }
      }
	
   }
