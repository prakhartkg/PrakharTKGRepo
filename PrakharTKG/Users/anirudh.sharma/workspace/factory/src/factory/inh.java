package factory;

class A{
	void m1(){
		System.out.println("A");
	}
	void m2(){
		System.out.println("A");	
	}
	void m3(){
		System.out.println("A");
	}
}

class B extends A{
	void m1(){
		System.out.println("B");
	}
}

class C extends B{
	void m3(){
		System.out.println("c");
	}
}
public class inh {
	public static void main(String[] args) {
		A a= new C();
		a.m3();
	}

}
