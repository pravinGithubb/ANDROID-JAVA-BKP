
// String - its a sequence of characters

public class StringDemo {

	public static void main(String[] args) {
		
		int num = 12;
		String name = "Tops";	// literal way 
		
		String str = new String("Technologies");
		
		System.out.println(name);
		System.out.println(str);
		
		// concat 
		System.out.println(name+str);
		
	
		// equals()
		String s1 = "Tops";
		String s2 = " Tops ";
		
		// length() and trim()
		System.out.println(s1.length());
		System.out.println(s2.trim().length());
		
		if(s1.equals(s2.trim())) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
		
		// equalsIgnorecase()
		String s3 = "ABC";
		String s4 = "abc";
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// split()
		
		String s5 = "    Hello Guys.. this is Android Lecture";
		
		String[] array = s5.trim().split(" ",3);
		
		System.out.println("Length of an array : "+array.length);
		
		for(String s : array) {
			System.out.println(s);
		}
		
		//contains()
		
		String s6 = "Welcome to Tops Technologies Tops";
		
		System.out.println(s6.contains("logies"));
		
		
		
		// replace()
		String s7 = s6.replace("Tops","Hops");
		System.out.println(s7);
		System.out.println("value of s6 = "+s6);
		
		System.out.println(s6.replaceFirst("Tops", "Hops"));
		
		// format()
		
		System.out.println(String.format("value of s6 = %s", s6));
		
		
		// substring()
		System.out.println(s6.substring(0,7));
		
		// concat()
		System.out.println(s6.concat("Hello"));
	
		// charAt()
		System.out.println(s6.charAt(4));
		
		// indexOf()
		System.out.println(s6.indexOf('o'));
		
		
		// toCharArray() Converts String to char[]
		for(char ch : s6.toCharArray()) {
			System.out.println(ch);
		}
		
		for(int i = 0; i<s6.length(); i++) {
			
			char ch = s6.charAt(i);
			
			if(ch=='o') {
				System.out.println("index of o : "+i );
			}
			
			//System.out.println();
		}
		
		char[] chr = s6.toCharArray();
		
		System.out.println(chr[4]);
		
		// toUpperCase() or toLowerCase()
		
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		
		
	}
	
}
