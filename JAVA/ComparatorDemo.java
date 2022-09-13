package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age) {
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

}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Student current = (Student) o1;
		Student specified = (Student) o2;
		
		return current.getName().compareTo(specified.getName());
	}
	
}

class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student current, Student specified) {
		
		if(current.getAge()> specified.getAge()) {
			return 1;
		}else if(current.getAge()<specified.getAge()) {
			return -1;
		}
		return 0;
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
	
		ArrayList<Student> studeList = new ArrayList<Student>();
		studeList.add(new Student(12, "Ravi", 30));
		studeList.add(new Student(10, "Dhiren", 28));
		studeList.add(new Student(67, "Piyush", 23));
		
		
		//Collections.sort(colorList, Collections.reverseOrder());
		
		Collections.sort(studeList, new AgeComparator());
		
		for(Student student : studeList) {
			System.out.println(student.getName()+", "+student.getAge());
		}
		
		System.out.println("********* Name wise sorting *********");
		
		Collections.sort(studeList, new NameComparator());
		
		for(Student student : studeList) {
			System.out.println(student.getName()+", "+student.getAge());
		}
		
	}
	
}
