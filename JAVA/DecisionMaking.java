// WAP to find out largest number from given three numbers 

public class DecisionMaking {

	public static void main(String[] args) {
		
		
		int num1 = 34, num2 = 45, num3= 77, result = 0;
		
		// Ternory operator or Condiontional operator 
		
		// syntax: -  (conditon) ? true : false;
		
		String msg = (num1>num2)? "num1 is greater" : "num2 is greater";
		
		System.out.println(msg);
		
		/*
		 * if(num1 >num2 && num1>num3) { // num1 is greater result = num1; }else
		 * if(num2>num1 && num2>num3) { // num2 is greater result = num2; }else { //
		 * num3 is greater result = num3; }
		 */
		
		/*
		 * if(num1>num2) { // num1 is greater
		 * 
		 * if(num1>num3) { // num1 is greater result = num1; }else { // num3 is greater
		 * result = num3; }
		 * 
		 * }else { // num2 is greater if(num2>num3) { // num2 is greater result = num2;
		 * }else { // num3 is greater result = num3; }
		 * 
		 * }
		 */		
		System.out.println("largest number : "+result);
		
	}
	
}
