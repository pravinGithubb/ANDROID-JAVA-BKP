package oops;

// super - a reference variable which refers parent class object.

class RBI{
	
	String name;
	
	private int minInt = 4;
	
	
	public RBI(String name) {
		this.name = name;
	}



	// overridden method
	float getInterest(float amount){
		return amount*minInt/100;
	}
	
}


class SBI extends RBI{
	
	public SBI(String name) {
		super(name);		// invoke parent class constructor using super
		
	}

	String name= "SBI";
	
	// overriding method
	float getInterest(float amount){
		return amount*6/100;
	}
	
	void showName() {
		System.out.println("name  : "+name);
		System.out.println("name  : "+super.name);	// parent class member
		System.out.println("Interest : "+super.getInterest(3000)); // 
	}
	
}

public class AnotherPolymorphismDemo {

	public static void main(String[] args) {
			
		SBI s1 = new SBI("RBI");
		System.out.println("Interest : "+s1.getInterest(3000));
		s1.showName();
		
	}
	
}
