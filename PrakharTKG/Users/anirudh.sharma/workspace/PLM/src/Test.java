import java.util.Scanner;

import org.yash.plm.exception.BookNotFoundException;
import org.yash.plm.exception.PersonNotFoundException;


public class Test {
	static int no;
	public static void menu(MyLibrary my){
		Scanner sc=new Scanner(System.in);
		System.out.println("********************MENU**********************");
		System.out.println("Prass 1. To Add Person");
		System.out.println("Prass 2. To Add Book");
		System.out.println("Prass 3. To Remove Person");
		System.out.println("Prass 4. To Remove Book");
		System.out.println("Prass 5. To Issue a Book");
		System.out.println("Prass 6. To Submit a Book");
		System.out.println("Prass 7. To Get Available books");
		System.out.println("Prass 8. To Know how many more Books A person Can Issue ");
		System.out.println("Prass 9. To exit ");
		no=sc.nextInt();
		switch(no){
		case 1:
			my.addPerson();
			break;
		case 2:
			my.addBook();
			break;
		case 3:
			
			try {
				my.removePerson();
			} catch (PersonNotFoundException e1) {
				System.out.println(e1.getMessage());
			}
			break;
		case 4:
			System.out.println("List Of all Available Books");
			my.showAvailableBook();
			System.out.println("Enter Book ID");
			int bookid=sc.nextInt();
			try {
				my.removeBook(bookid);
			} catch (BookNotFoundException e) {
				
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			my.showAvailableBook();
			System.out.println("Enter your Id");
			int pId=sc.nextInt();
			System.out.println("Enter Book Id you want To issue");
			int bId=sc.nextInt();
			my.checkOut(pId, bId);
			break;
		case 6:
			System.out.println("Enter your Id");
			pId=sc.nextInt();
			System.out.println("Enter Book Id you want To issue");
			bId=sc.nextInt();
			my.checkIn(pId, bId);
			break;
		case 7:
			System.out.println("No of available Books="+my.availableBooks());
			break;
		case 8:
			System.out.println("Enter Person's Id ");
			int id=sc.nextInt();
			System.out.println("No Of books You can Loan="+my.getAvailableBooksForPerson(id));
			break;
		case 9:
			sc.close();
			System.exit(0);
		default:
			System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) {
		MyLibrary myLib=new MyLibrary();
		do{
			menu(myLib);
		}while(true);

	}
}
