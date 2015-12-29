class A{
	
}

class B extends A{
	
}
class C extends B{
	
}

class D extends A{
	
}
class E extends D{
	
}

class Test{
	public static void main(String ...args){
		//A a=new B();
		A a=new A();
		A a3=new C();
		A a2=new D();
		A a1=new E();
		if(a instanceof B){
			B b=(B) a;
		
		}
	}

}