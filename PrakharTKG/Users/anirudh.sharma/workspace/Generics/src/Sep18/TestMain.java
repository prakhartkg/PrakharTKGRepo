package Sep18;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String...args){
		
		
		List<Employee>  traineelist=new ArrayList<>();
		traineelist.add(new Trainee(1,"Rm"));
		traineelist.add(new Trainee(2,"Rama"));
		traineelist.add(new Trainee(3,"Raaam"));
		traineelist.add(new Trainee(4,"Raam"));
		
		List<Manager> managerlist=new ArrayList<>();
		managerlist.add(new Manager(1,"Prashu"));
		managerlist.add(new Manager(2,"Prashu"));
		managerlist.add(new Manager(3,"Prashu"));
		Finance<Manager> f=new Finance<>();
		f.creditSalary(managerlist);
	}
} 