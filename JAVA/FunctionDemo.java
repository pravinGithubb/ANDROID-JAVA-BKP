
public class FunctionDemo {

	static void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	
	static int factorial(int num)
	{
		int fact = 1;
		for(int i = 1; i<=num; i++)
		{
			fact*=i;
		}
		
		return fact; 
	}
	
	public static void main(String[] args) {
		
		add(34,6);		// function calling
		add(11,3);
		
		int f1 = factorial(5);
		int f2 = factorial(7);
		
		System.out.println("value of f1 = "+f1);
		System.out.println("value of f2 = "+f2);
	}
	
}
