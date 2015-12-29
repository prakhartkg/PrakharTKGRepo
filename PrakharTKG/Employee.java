class Employee{
	private int emp_id;
	private int age;
	private String name;
	
	Employee(int emp_id,String name,int age){
		this.emp_id=emp_id;
		this.name=name;
		this.age=age;
	}
	
	public int getEmp_id(){
		return emp_id;
	}
	
	public int getAge(){
		return age;
	}

	public String toString(){
		return name;
	}
}






