package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListDemo {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		// add 
		numList.add(23);
		numList.add(66);
		numList.add(66);
		numList.add(89);
		
		// remove
		numList.remove(2);
		
		for(int num : numList) {
			System.out.println(num);
		}
		
		ArrayList<String> langList = new ArrayList<String>();
		
		langList.add("Android");
		langList.add("Java");
		langList.add("Flutter");
		langList.add("Dart");
		langList.add("Dart");
		langList.add("Dart");
		langList.add("Kotlin");
		
		String str = "";
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * while(!str.equals("stop")) {
		 * 
		 * str = scanner.next();
		 * 
		 * if(!str.equals("stop")) langList.add(str);
		 * 
		 * }
		 */
		
		/*
		 * for(int i=0; i<langList.size(); i++) { System.out.println(langList.get(i)); }
		 */
		
		System.out.println(langList);
		
		// remove 
		langList.remove("Dart");
		
		System.out.println(langList);
		
		// set
		langList.set(1, "PHP");
		
		System.out.println(langList);
		
		// add
		langList.add(2, "Java");
		
		System.out.println(langList);
		
		
		
		// lastIndexOf()
		System.out.println(langList.lastIndexOf("Dart"));
		
		// indexOf 
		System.out.println(langList.indexOf("Dart"));
		
		// sort

		Collections.sort(langList);
		
		System.out.println(langList);
		
		// clear()
		langList.clear();
		System.out.println(langList);
		
		
		/*
		 * for(String str : langList) { System.out.println(str); }
		 */
		
		
	}
	
}
