import java.util.*;
class TestMain{
	static int no;
	static Set list;
	public static void menu(Set list1){
		Scanner sc=new Scanner(System.in);
		System.out.println("*****************************MENU*****************************");
		System.out.println("Prass 1. To Add Yash Employee");
		System.out.println("Prass 2. To  Show/Iterate");
		System.out.println("Prass 3. Synchronized set ");
		System.out.println("Prass 4. Read only set ");
		System.out.println("Prass 5. remove employee ");

		System.out.println("Prass 6. To exit ");
		no=sc.nextInt();
		switch(no){
			case 1:
			try{
			list1.add(new YashEmployee());
			}catch(UnsupportedOperationException e )
			{
				System.out.println("Cant Add Now");
			}
			break;
			case 2:
			System.out.println("Id            Name                 Age             Salary");
				Iterator itr=list1.iterator();
				while(itr.hasNext()){
				YashEmployee yte=(YashEmployee)itr.next();
				System.out.printf("%-13d %-20s %-15d %-22.2f",yte.getId(),yte.getName(),yte.getAge(),yte.getSalary());
				System.out.println();
				}
			break;
			case 6:
			System.exit(0);
			break;
			case 5:
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			if(list.remove(new YashEmployee(id,name,1,1d)))
				System.out.println("Employee "+name+" Deleted");
			else
				System.out.println("Employee not found");
			break;
			case 3:
				Set hs=Collections.synchronizedSet(list1);
				itr=hs.iterator();
				while(itr.hasNext()){
				YashEmployee yte=(YashEmployee)itr.next();
				System.out.printf("%-13d %-20s %-15d %-22.2f",yte.getId(),yte.getName(),yte.getAge(),yte.getSalary());
				System.out.println();
				}
			break;
			case 4:
			list=Collections.unmodifiableSet(list1);
			
			break;
			default:
			System.out.println("Invalid Input");
		}
	}
	public static void main(String...args){
		list=new HashSet();
		
		do{
			menu(list);
		}while(true);
		
	}
}