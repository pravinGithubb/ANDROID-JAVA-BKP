package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

/*Iterators are used in the Collection framework in Java to retrieve elements one by one. There are three iterators in Java

Enumeration

	elements() - we can create object using this method

	- public boolean hasMoreElements();
	- public Object nextElement();
	
Iterator

	iterator() - we can create object using this method
	
	- hasNext();
	- public Object next();
	- public void remove();

ListIterator

	listIterator(); - we can create object using this method
	
	public boolean hasNext();
	public Object next();
	public int nextIndex();
	public boolean hasPrevious();
	public Object previous();
	public int previousIndex();
	public void remove();
	public void set(Object obj); 
	public void add(Object obj);

*/

public class IteratorDemo {

	public static void main(String[] args) {
		
		// Enumaration
		Vector<String> list = new Vector<String>();
		list.addElement("Mumbai");
		list.addElement("Surat");
		list.addElement("JamshedPur");
		list.addElement("Baroda");
		
		System.out.println("******** Enumaration ***********");
		
		Enumeration<String> enumaration = list.elements();
		
		while (enumaration.hasMoreElements()) {
			String value = (String) enumaration.nextElement();
			System.out.println(value);
			
		}
		
		System.out.println("******** Iterator ***********");
		
		Iterator<String> i = list.iterator();
		
		while (i.hasNext()) {
			
			String value = (String) i.next();
			
			if(value.equals("Surat")) {
				i.remove();
			}
			
		}
		
		System.out.println(list);
		
		System.out.println("******** List iterator ***********");
		
		ListIterator<String> iterator = list.listIterator();
		
		while (iterator.hasNext()) {
			
			String value = (String) iterator.next();
			
			if(value.equals("Mumbai")) {
				iterator.remove();
			}
			
			if(value.equals("JamshedPur")) {
				iterator.set("Jamshed pur");
			}
	
		}
		
		System.out.println(list);	
		
		System.out.println("******** iterating Map collection ***********");
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(22, "Android");	
		map.put(33, "Java");	
		map.put(11, "Android");
		map.put(44, "Flutter");
		map.put(55, "Dart");
		map.put(null,"");
		
		Iterator itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
			
			Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
			
			System.out.println(entry.getKey()+","+entry.getValue());
			
		}
		
		
		
	}
	
}
