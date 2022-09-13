import java.util.Scanner;

public class ArrayDemo {

	static boolean validate(int sum) {
		
		if(sum>1000) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		//int nums[10]; 
		
		
		
		int[] num = new int[5];
		int sum = 0;
		
		String languages[] = {"Java", "Android", "Dart", "flutter", "Kotlin"};
		
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Length of an array : "+num.length);
		
		
		for(int i = 0; i<num.length; i++)
		{
			System.out.print("Enter value of index "+i+" : " );
			num[i] = scanner.nextInt();
			sum+=num[i];
		}
		
		
		for(int n : num) {
			System.out.println(n);
		}
		
		System.out.println("Summation of given element : "+sum);
		
		// for each loop
		for(String lang : languages) {
			System.out.println();
		}
		
		System.out.println(validate(sum));
		
		
	}
	
	
	
}
