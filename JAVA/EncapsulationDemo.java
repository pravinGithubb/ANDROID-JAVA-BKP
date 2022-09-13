package oops;

import java.util.Scanner;

/*Encapsulation in Java is a mechanism of wrapping the data (variables)
and code acting on the data (methods) together as a single unit. 
In encapsulation, the variables of a class will be hidden from other classes, 
and can be accessed only through the methods of their current class.

To achieve encapsulation in Java −
Declare the variables of a class as private.
Provide public setter and getter methods to modify and view the variables values.*/

class Item{
	
	private int id;
	private String name; 
	private String desc;
	private float price;
	private float dis;
	
	public Item()
	{}
	
	public Item(int id, String name, String desc, float price, float dis) {
	
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.dis = dis;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDis() {
		return dis;
	}
	public void setDis(float dis) {
		this.dis = dis;
	}
	
	
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
	
		/*
		 * Item p1 = new Item(); p1.setId(12); p1.setName("Fruit");
		 * p1.setDesc("descrpition"); p1.setPrice(34.5f);
		 * 
		 * 
		 * Item p2 = new Item(11, "clothes", "desc", 346.7f, 2.5f);
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = scanner.nextInt();
		
		Item[] items = new Item[size];
		items[0] = new Item(2, "Fruits", "desc", 50045f, 5f);
		items[1] = new Item(11, "clothes", "desc", 346.7f, 2.5f);
		
		// iterate array using for loop
		for(int i = 0; i<items.length; i++)
		{
			Item item = items[i];
			System.out.println("id : "+item.getId());
			System.out.println("Name : "+item.getName());
			System.out.println("Price : "+item.getPrice());
				
		}
		
		
	}
	
}
