import java.util.Comparator;
class SortEmployeeSalary implements Comparator{
	public int compare(Object obj1,Object obj2){
		YashEmployee emp1=(YashEmployee) obj1;
		YashEmployee emp2=(YashEmployee) obj2;
		if(emp1.getSalary()>emp2.getSalary())
			return 1;
		return -1;
	}
	
}