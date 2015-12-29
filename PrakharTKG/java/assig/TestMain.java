import java.util.Scanner;
class TestMain{
	
	public static void main(String...args){
		int ch;
		Scanner sc=new Scanner(System.in);
		int[] temp;
		System.out.println("Enter no of elements");
		int no=sc.nextInt();
		int[] arr=new int[no];
		System.out.println("Enter "+no+" Elements of array");
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		do{
			System.out.println("Press 1 if you want to continue else any no to exit");
			ch=sc.nextInt();
			if(ch!=1)
			{
				System.out.println("Array is.......");
				for(int i=0;i<arr.length;i++)
					System.out.println(arr[i]);
				System.exit(0);
			}
			temp=new int[arr.length];
			System.arraycopy( arr, 0, temp, 0, arr.length );
			arr=new int[++no];
			System.arraycopy( temp, 0, arr, 0, temp.length );
			System.out.println("Enter no..");
			arr[no-1]=sc.nextInt();
		}while(true);
		
		
		
		
		
	}
	
	
}