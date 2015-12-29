class A
{
public final void display(B b)
{
System.out.println("hii from class A");
}
}
class B extends A
{
final public void display(C c )
{
System.out.println("hii from class B");
}
}
class C extends B
{
final public void display(A a)
{
System.out.println("hii from class C");
}
}
public class Test {
public static void main(String []args){
A obj1=new B();
 
obj1.display(new C());
 
B obj2=new C();
 
obj2.display(new B());
 
A obj3=new C();
 
obj3.display(new B());
 
}
}