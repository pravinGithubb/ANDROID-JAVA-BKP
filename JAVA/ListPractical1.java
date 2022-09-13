package collection;

import java.util.ArrayList;

class Product{
	
	private int id;
	private String name;
	private String desc;
	private float price;
	
	public Product(int id, String name, String desc, float price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
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
	
}

public class ListPractical1 {

	public static void main(String[] args) {
	
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Mobile", "description", 23000f));
		list.add(new Product(2, "Fan", "description", 2340f));
		list.add(new Product(3, "Jeans", "description", 500f));
		list.add(new Product(4, "T-shirt", "description", 450f));
		
		
		// using for-each loop
		for(Product p : list) {
			System.out.println(p.getName());
		}
		
		System.out.println("*************************");
		
		for(int i =0; i<list.size();i++)
		{
			//Product p = list.get(i);
			System.out.println(list.get(i).getName());
		}
		
	}
	
}
