package oops;

class ComplexNumber{
	
	
	//for real and imaginary parts of complex numbers
	   double real, img;
		
	   //constructor to initialize the complex number
	   ComplexNumber(double r, double i){
		this.real = r;
		this.img = i;
	   }
	
}


public class B_42 {

	public static void main(String[] args) {
	
		ComplexNumber c1 = new ComplexNumber(12.4,  45.6);
		ComplexNumber c2 = new ComplexNumber(34.4,  78.6);
		
		ComplexNumber result = sum(c1, c2);
		System.out.println("Real no : "+result.real +", Imaginary : "+result.img);
	}

	static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		
		ComplexNumber temp = new ComplexNumber(0, 0);
		
		temp.real = c1.real+c2.real;
		temp.img = c1.img +c2.img;
		return temp;
	}

	
}

