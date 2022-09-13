import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		
		int num1 , num2, sum ;
		float mFloat;
		
		String name;
		char ch;
		String str = "Dhiren";
		
		Scanner scanner = new Scanner(System.in);		// create object of Scanner class 
		
		System.out.println("Enter Name : ");
		name = scanner.nextLine();
		
		System.out.print("Enter num1 : ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter num2 : ");
		num2 = scanner.nextInt();
		
		
		System.out.println("Enter character : ");
		ch = scanner.next().charAt(0);
		
		System.out.println("Enter value of mFLoat : ");
		mFloat = scanner.nextFloat();
		

		
		
		sum = num1+num2;
		
		
		System.out.println("Value of ch : "+ch);
		System.out.println("Name = "+name);
		System.out.println("Value of mFloat = "+mFloat);
		System.out.println("Addition : "+sum);
		//System.out.println("Addition : "+(num1+num2));
		
		
	}

}
