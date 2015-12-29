import java.util.*;

class TestMain{
	static int no;
	public static void menu(ArrayList list){
		Scanner sc=new Scanner(System.in);
		System.out.println("********************MENU**********************");
		System.out.println("Prass 1. To Add Yash Employee");
		System.out.println("Prass 2. To  Show/Iterate");
		System.out.println("Prass 3. To Sort Employees By Age ");
		System.out.println("Prass 4. To Sort Employees By CEO/ By Salary ");
		System.out.println("Prass 5. To Sort Employees By HR/ By Name ");
		System.out.println("Prass 6. To exit ");
		no=sc.nextInt();
		switch(no){
			case 1:
			
			list.add(new YashEmployee());
			break;
			case 2:
			System.out.println("Id            Name                 Age             Salary");
				Iterator itr=list.iterator();
				while(itr.hasNext()){
				YashEmployee yte=(YashEmployee)itr.next();
				System.out.printf("%-13d %-20s %-15d %-22.2f",yte.getId(),yte.getName(),yte.getAge(),yte.getSalary());
				System.out.println();
				}
			break;
			case 6:
			System.exit(0);
			break;
			case 3:
			Collections.sort(list);
			break;
			case 4: 
			Collections.sort(list,new SortEmployeeSalary());
			break;
			case 5: 
			Collections.sort(list,new SortEmployeeName());
			break;
			default:
			System.out.println("Invalid Input");
		}
	}
	public static void main(String...args){
		ArrayList list=new ArrayList();
		do{
			menu(list);
		}while(true);
		
	}
}