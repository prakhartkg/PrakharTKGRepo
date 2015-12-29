package MyMap;

public class Test extends MyHashMap {
public static void main(String[] args) {
	MyHashMap my=new MyHashMap();
	
	
	my.put("A", 5);
	my.put("B", 4);
	my.put("C", 3);
	my.put("D", 2);
	my.put("E", 1);
	my.put("D", 12);
	
	System.out.println(my.get("D"));
	
	
	
}
}
