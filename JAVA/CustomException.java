package exception_handling;

class MyException extends Exception{

	public MyException(String msg) {
		super(msg);
	}
		
}


public class CustomException {

	
	static void ageValidator(int age) {
		
		
		if(age>=18) {
			System.out.println("eligible to vote");
		}else {
			// explicitly throw exception
			try {
				throw new MyException("not eligible");
				
			}catch(MyException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int age = 17;
		
		ageValidator(age);
		
		
	}
	
}
