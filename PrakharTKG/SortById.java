import java.util.*;
class SortById implements Comparator{
	
	public int compare(Object object1,Object object2){
		Employee emp1=(Employee)object1;
		Employee emp2=(Employee)object2;
		if(emp1.getEmp_id()>emp2.getEmp_id()){
			return 1;
		}
			
		else if(emp1.getEmp_id()<emp2.getEmp_id()){
			return -1;
		}
			
		else{
		return 0;	
		}
		
}
}