import java.util.Scanner;
class YashEmployee implements Comparable{
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

	public int compareTo(Object ob){
		YashEmployee yts=(YashEmployee)ob;
		if(this.age==yts.getAge() && this.getId()==yts.getId())
			return 0;
		else if(this.age>yts.getAge())
			return 1;
		else
			return -1;
	}
}