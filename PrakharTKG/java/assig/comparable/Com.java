    import java.util.*;  
    import java.io.*;  
      
    class Com{  
    public static void main(String args[]){  
      
    Student[] students  =new Student[3];  
    Student s1 = new Student(101,"Vijay",10);  
    Student s2 = new Student(106,"Ajay",15);  
    Student s3 = new Student(105,"Jai",8);  
       students[0]=s1;
	    students[1]=s2;
		 students[2]=s3;
    Arrays.sort(students);  
	for(Student s: students)
    System.out.println(s.rollno+""+s.name+""+s.age);  
      }  
    }  
    