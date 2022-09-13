
public class NestedLoop {

	
	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++)			/// outer loop 
		{
			 for(int j = 0; j<=i; j++)		// inner loop
			 {
				 
				 if(i==3 && j == 1) {
					 continue;
				 }
				 
				System.out.println("i = "+i+"  j="+j);
			 }
			 
			 System.out.println();
			 
		}
		
	}
	
}
