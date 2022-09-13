package oops;

// this - its a reference variable which refers current class object.

class Student{
	
	int id;
	String name;
	String email;
	boolean isOnline = false;
	
	
	Student()
	{
	}
	
	// parameterized constructor 
	Student(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	Student(String name, String email, int id)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	Student(int id, String name, String email, boolean isOnline)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.isOnline = isOnline;
	}
	
	
	void setData(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	
	
	
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("email : "+email);
		System.out.println("status : "+isOnline);
	}
	
}

public class Test {

	public static void main(String[] args) {
	
		
		Student s1 = null;	
	
		// object initialization using by reference
		s1 = new Student();
		
		s1.id = 1;
		s1.name = "Ravi";
		s1.email = "ravi@gmail.com";
		
		s1.display();
		
		// object initialization using by method
		Student s2 = new Student();
		s2.setData(23, "Laksh", "laksh@gmail.com");
		s2.display();
		
		// object initialization using constructor 
		Student s3 = new Student(3, "Dhiren", "dhiren@gmail.com");
		s3.display();
		
		Student s4 = new Student(4, "Jayesh", "jayesh@gmail.com", true);
		s4.display();
	}
	
}
