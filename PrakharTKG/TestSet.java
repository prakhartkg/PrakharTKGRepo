import java.util.*;
class TestSet{
	public static void main(String...args){
		Set<Employee> employees=new TreeSet(new SortByAge());
		employees.add(new Employee(1,"A",10));
		employees.add(new Employee(2,"B",30));	
		employees.add(new Employee(3,"C",20));
		System.out.println(employees);
		/*
		Set<Employee>employees1=new TreeSet(new SortByAge());
		employees1.add(new Employee(1,"A",10));
		employees1.add(new Employee(2,"B",30));	
		employees1.add(new Employee(3,"C",20));
		System.out.println(employees1);
		*/
	}
}