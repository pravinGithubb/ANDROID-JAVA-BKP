
public class WrapperClassDemo {

	public static void main(String[] args) {
		
		// String to int
		String str = "123";
		
		// converts string to int
		int num1 = Integer.parseInt(str);
		float num2 = Float.parseFloat(str);
		
		System.out.println(num1+10);
		System.out.println(num2);
		
		// Converts primitive values to String 
		
		String number = String.valueOf(num2);
		
		System.out.println(number+456);
		
		
		Integer num3 = 5;
		System.out.println(num3.intValue());
		
	}
	
}
