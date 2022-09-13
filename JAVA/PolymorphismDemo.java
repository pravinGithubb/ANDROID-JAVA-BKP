package oops;

/*Polymorphism is one of the OOPs feature 
that allows us to perform a single action in different ways.

There are two types of polymorphism in java:-

Compile time polymorphism also known as Static polymorphism - this can be achived using method overloading 
Run time polymorphism also known as Dynamic polymorphism - this can be achived using method overriding
*/

class Calculator{
	
	void add(int num1,int num2) {
		System.out.println("Addition : "+(num1+num2));
		
	}
	
	void add(float num1, float num2) {
		System.out.println("Addition : "+(num1+num2));
	}
	
}

public class PolymorphismDemo {

	
		public static void main(String[] args) {
			
			
			Calculator c1 = new Calculator();
			c1.add(23, 12);
			c1.add(23.5f, 12.2f);
	
			
		}
	
}
