package oops;


abstract class Shape {
	
	void show() {		// concrete method 
		System.out.println("Normal method called");
	}
	
	abstract void init();
	
	abstract float area();		// abstract method 
	
}


class Rectangle extends Shape {

	float l= 12.4f, b = 6.5f;
	
	@Override
	float area() {
	
		return l*b;
	}

	@Override
	void init() {
		// TODO Auto-generated method stub
		
	}
	
}

class Square extends Shape{

	float side = 32.5f;
	
	@Override
	float area() {
		
		return side*side;
	}

	@Override
	void init() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractionDemo {
	

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.show();
		
		System.out.println("Area of Rectangle : "+r1.area());
		
		Square s1 = new Square();
		s1.show();
		System.out.println("Area of Square : "+s1.area());
		
	}
	
}
