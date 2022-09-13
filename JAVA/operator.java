
public class operator {

	public static void main(String[] args) {
		
		int num =34, num2=45;

		//num = num+10;
		num+=10;
		
		// num++, num--	(postfix)
		// ++num, --num (prefix)
		
		System.out.println("Postfix : "+(num++));		// 44
		System.out.println("Postfix : "+(++num));	//46
		
		
		
		System.out.println(num>=num2 && num>=100);
		System.out.println(num>=num2 || num>=100);
		System.out.println(!(num>=100));
		
		//System.out.println("Addition : "+(34+10));
		
	}
}
