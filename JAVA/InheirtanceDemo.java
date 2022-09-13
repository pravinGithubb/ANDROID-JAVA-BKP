package oops;

class Member{			/// Parent class or Base class 
	
	String name;
	String contact;
	int age;
	float salary;
	
}

class Employee extends Member{		// Child class or Derived class
	
	String specialization;

	Employee(String name, String contact, int age, float salary, String specialization) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.contact = contact;
		this.specialization = specialization;
	}
	
	void display() {
		System.out.println("Age = "+age);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
	
}

public class InheirtanceDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Laksh", "3434343434", 17, 45000.5f, "Tester");
		e1.display();
		
		
	}
	
}
