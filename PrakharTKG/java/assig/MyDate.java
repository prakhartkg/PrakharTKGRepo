
public class MyDate{
	
	private int day = 1;
	private int month = 1;
	private int year = 2000;
	
	public MyDate(int day ,int month , int year){
		
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public MyDate(MyDate date){
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}
	
	public MyDate addDays(int moreDays){
		MyDate ne=new MyDate(this);
		ne.day+=moreDays;
		while(ne.day>30){
			ne.day-=30;
			ne.month++;
			if(ne.month>12){
				ne.month-=12;
				ne.year++;
			}
			
		}

		return ne; 	// ??
		
	}
	
	public String toString(){
	String date=day+"-"+month+"-"+year; 
		return date; 
	
	}
}