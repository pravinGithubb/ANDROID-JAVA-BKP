import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		char ch ='a';
		Scanner scanner = new Scanner(System.in);
		
		while(ch!='.') {
			
			ch = scanner.next().charAt(0);
			System.out.print(ch);
			
		}
		
		
	}
	
}
