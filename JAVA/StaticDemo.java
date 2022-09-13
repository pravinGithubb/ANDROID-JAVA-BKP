package oops;



class MStudent{
	
	private String name;
	private int roll;
	private String email;
	
	static String collegeName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	void display() {		// normal method
		System.out.println(roll+","+name+", "+email+","+collegeName);
		
	}
	
	
	static void show()		// static method
	{
		System.out.println(collegeName);
	}
	
}

public class StaticDemo {

	
	
	static String name;
	
	// static block are used to initialize static member
	static{
		System.out.println("Static blocked called");
		name = "abc";
	}
	
	public static void main(String[] args) {
		
		//MStudent.show();
		
		MStudent.collegeName = "Tops Tech";
	
		
		MStudent s1 = new MStudent();
		s1.setRoll(1);
		s1.setName("abc");
		s1.setEmail("abc@gmail.com");
		
		MStudent s2 = new MStudent();
		s2.setRoll(2);
		s2.setName("xyz");
		s2.setEmail("xyz@gmail.com");
		
		s1.display();
		s2.display();
		
		System.out.println("College Name : "+MStudent.collegeName);
		
	}
	
}
