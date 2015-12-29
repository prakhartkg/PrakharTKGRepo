import java.util.*;
class TestMap{
	public static void main(String...args){
		Map<Integer,Employee> employees=new TreeMap();
		employees.put(2,new Employee(3,"A",10));
		employees.put(3,new Employee(2,"B",10));
		employees.put(1,new Employee(1,"C",10));
		System.out.println(employees);
		
		for(Map.Entry e:employees.entrySet()){
			System.out.println("Key="+e.getKey()+" Value="+e.getValue().toString());
		}
	}
}