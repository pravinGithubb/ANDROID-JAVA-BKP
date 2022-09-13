package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//HashMap<String, ArrayList<String>> mMap = new HashMap<String, ArrayList<String>>();
		
		//HashMap<String, HashMap<Integer, ArrayList<String>>> nMap = new HashMap<String, HashMap<Integer,ArrayList<String>>>();
		// add
		map.put(22, "Android");	
		map.put(33, "Java");	
		map.put(11, "Android");
		map.put(44, "Flutter");
		map.put(55, "Dart");
		map.put(null,"");
		
		// read or get 
		System.out.println(map.get(44));

		// remove
		map.remove(33);
		
		// replace
		map.replace(55, "Dart", "Kotlin");
		
		//put 
		map.put(55, "Python");
		
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey()+","+e.getValue());
		}
		
		
		
	}
	
}
