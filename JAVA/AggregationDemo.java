package oops;

class Address{
	
	private String state;
	private String city;
	
	
	
	
	public Address(String state, String city) {
	
		this.state = state;
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}

class Emp{
	
	private int id;
	private String name;
	private Address address;		
	
	
	
	public Emp(int id, String name, Address address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}

public class AggregationDemo {

	public static void main(String[] args) {
		
		
		final float PI = 3.14f;
		
		
		
		Emp e1 = new Emp(12, "Dhaval", new Address("Guajrat", "Surat"));
		
		System.out.println("Name : "+e1.getName());
		System.out.println("Address : "+e1.getAddress().getCity()+","+e1.getAddress().getState());
	}
	
}
