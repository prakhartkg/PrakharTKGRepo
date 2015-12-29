import java.util.*;
class SortByAge implements Comparator{
	
	public int compare(Object object1,Object object2){
		Employee emp1=(Employee)object1;
		Employee emp2=(Employee)object2;
		if(emp1.getAge()>emp2.getAge()){
			return 1;
		}
		else if(emp1.getAge()<emp2.getAge()){
				return -1;
		}
		else{
			return 0;
		}
		
}
}