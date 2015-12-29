class A{
	void m1(){
		System.out.println("A");
	}
}
class B1 extends A{
	
}
class B2 extends A{
	void m1(){
		System.out.println("B2");
	}
}
class C1 extends B1{
	
}
class C2 extends B1{
	void m1(){
		System.out.println("C2");
	}
}
class TestInheritance{
	public static void main(String...args){
		A c=new B2();
		c.m1();
	}
} 