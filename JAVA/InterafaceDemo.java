package oops;

interface I1{
	
	public static final int num = 12;
	
	void display(int num);	// abstract 
	
	void show(String name);
	
}

interface I2{
	
	String name = "Tops Technologies";
	
	void show(String name);
	
}

public class InterafaceDemo implements I1, I2{

	
	public static void main(String[] args) {
		
		InterafaceDemo d1 = new InterafaceDemo();
		d1.show(name);
		
	}

	@Override
	public void show(String name) {
		System.out.println("Name : "+name);
	}

	@Override
	public void display(int num) {
		System.out.println("Num : "+num);
	}
	
}
