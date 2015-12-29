private class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
}
class C extends B{
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instance");
	}
	C(){
		System.out.println("C");
	}
}
class Test{
	public static void main(String...args){
	C c=new C();}
}