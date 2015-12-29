import java.util.*;  
import java.io.*;  

public class Demo{  
	public static void main(String[] args)throws IOException{  
		FileReader reader=new FileReader("db.properties");  
		Properties p=new Properties();  
		p.load(reader);  
		System.out.println(p.getProperty("name1"));  
		System.out.println(p.getProperty("name2"));  
	}  
}  