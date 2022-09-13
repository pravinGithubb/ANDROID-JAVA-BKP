package oops;

class A {
	
	int a = 100;
	
	void showA() {
		System.out.println("value of a : "+a);
	}
	
}

class B extends A{
	
	int b = 200;
	
	void showB() {
		System.out.println("value of ab : "+b);
	}
	
}

class C extends A{
	
	int c = 300;
	
	void showC() {
		System.out.println("value of c : "+c);
	}
	
	
}

public class MultiLevelDemo {

	public static void main(String[] args) {
		
		A objA = new A();
		objA.showA();
		
		System.out.println("******************");
		
		B objB = new B();
		objB.showA();
		objB.showB();
		
		System.out.println("******************");
		
		C objC = new C();
		objC.showA();
		//objC.showB();
		objC.showC();
		
		
	}
	
}
