import java.util.Scanner;
class YashEmployee {
	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	
	public YashEmployee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Employee  Age");
		age=sc.nextInt();
		System.out.println("Enter Employee Salary");
		salary=sc.nextDouble();
	}
	
	public YashEmployee(Integer id,String name,Integer age,Double salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public void setSalary(Double salary){
		this.salary=salary;
	}
	
	public Integer getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public Integer getAge(){
		return age;
	}
	
	public Double getSalary(){
		return salary;
	}
	
	public int hashCode(){
		return id;
	}
	public boolean equals(Object o){
		YashEmployee yts=(YashEmployee)o;
		if(this.getId()==yst.getId() && this.getName().equals(yts.getName()))
			return true;
		return false;
	}

}