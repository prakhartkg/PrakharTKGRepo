import java.util.*;
class TestMain{
	static int no;
	public static void menu(HashSet list){
		Scanner sc=new Scanner(System.in);
		System.out.println("********************MENU**********************");
		System.out.println("Prass 1. To Add Yash Employee");
		System.out.println("Prass 2. To  Show/Iterate");

		System.out.println("Prass 3. To exit ");
		no=sc.nextInt();
		switch(no){
			case 1:
			list.add(new YashEmployee());
			break;
			case 2:
			System.out.println("Id             Name                Age              Salary");
				Iterator itr=list.iterator();
				while(itr.hasNext()){
				YashEmployee yte=(YashEmployee)itr.next();
				System.out.printf("%-13d %-20s %-15d %-22.2f",yte.getId(),yte.getName(),yte.getAge(),yte.getSalary());
				System.out.println();
				}
			break;
			case 3:
			System.exit(0);
			break;
			
			default:
			System.out.println("Invalid Input");
		}
	}
	public static void main(String...args){
		HashSet list=new HashSet();
		do{
			menu(list);
		}while(true);
		
	}
}