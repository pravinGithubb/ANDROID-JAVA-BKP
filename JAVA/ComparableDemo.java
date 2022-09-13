package collection;

import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User>{
	
	private int id;
	private String name;
	private int age;
	
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User object) {
		
		return name.compareTo(object.getName());
		
		/*
		 * if(age> object.age) { return 1; }else if (age<object.age) { return -1; }
		 * 
		 * return 0;
		 */
	}
	
	
	
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		
		
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(12, "Ravi", 30));
		userList.add(new User(10, "Dhiren", 28));
		userList.add(new User(67, "Piyush", 23));
		
		
		//Collections.sort(colorList, Collections.reverseOrder());
		
		Collections.sort(userList);
		
		for(User user : userList) {
			System.out.println(user.getName()+", "+user.getAge());
		}
		
	}
	
}
