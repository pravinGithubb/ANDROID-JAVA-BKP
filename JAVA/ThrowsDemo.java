package exception_handling;

public class ThrowsDemo {
	
		static void ageValidator(int age) throws MyException {
				
				
			if(age>=18) {
					System.out.println("eligible to vote");
				}else {
					throw new MyException("not eligible");
				}
				
			}
			
			
			public static void main(String[] args) {
				
				int age = 17;
				
				try {
					ageValidator(age);
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}

}
