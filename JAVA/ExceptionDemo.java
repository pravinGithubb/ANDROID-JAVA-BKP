package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class XYZ{
	
	void print()
	{
		System.out.println("print method called");
	}
	
}

/*
 * try 
 * catch 
 * finally
 * 
 */

public class ExceptionDemo {

	public static void main(String[] args) {
	

		
		try {
		
			// ArrayIndex out of bound
			String languages[] = {"Java", "Android", "Dart", "Flutter"};
			System.out.println(languages[2]);
				
			// Number format exception
			String str = "123";
			System.out.println(Integer.parseInt(str)+10);
			
			// Null pointer exception
			XYZ x1 =new XYZ();
			x1.print();
			
			
			int num = 10;
			// Arethemetic exception
			float result = num/2;
			System.out.println("Result : "+result);
			
		}catch(Exception e) {
			//System.out.println(e.getClass());
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("finally block executed");
		}
		
		
		System.out.println("All code excuted..");
		
		
	}
	
}
