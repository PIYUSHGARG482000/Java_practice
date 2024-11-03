package dataStructuresOOPS.arrayList;
import java.util.*;
public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
	
		int size = fruits.size();
		String[] temp = new String[fruits.size()];
		fruits.toArray(temp);
		
		
		for(String e: fruits) {
			System.out.println(e);
		}
	
	}

}
