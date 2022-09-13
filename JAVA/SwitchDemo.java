import java.util.Scanner;

public class SwitchDemo {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter character : ");
		ch = scanner.next().charAt(0);
		
		
		for(int i =0; i<"Dhiren".length(); i++) {	
			System.out.println("Dhiren".charAt(i));
		}
		
		
		switch(ch) {
		
		case 'a' :
			System.out.println("Given character is vowel");
			break;
		case 'e' :
			System.out.println("Given character is vowel");
			break;
		case 'i' :
			System.out.println("Given character is vowel");
			break;
		case 'o' :
			System.out.println("Given character is vowel");
			break;
		case 'u' :
			System.out.println("Given character is vowel");
			break;
			default :
				System.out.println("Given character is consonant");
		}
		
	}
	
}
