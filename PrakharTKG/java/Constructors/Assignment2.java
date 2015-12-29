public class Assignment2{
	public static void main(String...args){
	Employee emp=new Employee();   //If we add a perametrized constructor then jvm do not add a default constructor   			
														// yes it executes because jvm by default put default constructor in class if there is no cunstructor
	Employee emp1=new Employee(1,"Ram");
	
	//System.out.println(emp.incriment());
	//System.out.println(Employee.incriment());
	//emp.print("RAM","Shyam");
		//emp.print("RAM","Shyam","Lakhan");
		
	}
	
}