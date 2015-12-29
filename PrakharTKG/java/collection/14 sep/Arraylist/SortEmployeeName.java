import java.util.Comparator;
class SortEmployeeName implements Comparator{
	public int compare(Object obj1,Object obj2){
		YashEmployee emp1=(YashEmployee) obj1;
		YashEmployee emp2=(YashEmployee) obj2;
		return emp1.getName().compareTo(emp2.getName());
		
	}
	
}