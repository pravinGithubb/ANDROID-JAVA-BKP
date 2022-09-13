package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> langList = new TreeSet<String>();
		langList.add("Java");
		langList.add("Android");
		langList.add("Flutter");
		langList.add("Dart");
		langList.add("Flutter");
		//langList.add(null);
		
		
		for(String str : langList)
		{
			System.out.println(str);
		}
	}
	
}
