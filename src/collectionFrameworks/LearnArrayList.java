package collectionFrameworks;
import java.util.*;
public class LearnArrayList {

	public static void main(String[] args) {
	
		
//	ArrayList<String> studentName = new ArrayList<>();	
//	studentName.add("Rakesh");
	
	List<Integer> list = new LinkedList<Integer>();
//	list.add(1);
//	list.add(2);
//	list.add(3);
//	System.out.println(list);
//	
//	list.add(4);
//	System.out.println(list);
//	
//	list.add(1, 50);
//	System.out.println(list);
//	
//	List<Integer> newList = new ArrayList<Integer>();
//	newList.add(150);
//	newList.add(160);
//	
//	list.addAll(newList);
//	System.out.println(list);
//	
//	System.out.println(list.get(1));
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	
	System.out.println(list);
	for(int i=0; i<list.size(); i++) {
		System.out.println("The Element is " + list.get(i));
	}
	for(Integer ele: list) {
		System.out.println("foreach element is " + ele);
	}
	
	Iterator<Integer> it = list.iterator();
	while(it.hasNext()) {
		System.out.println("Iterator" + it.next());
	}
	
//	System.out.println(list);
//	list.set(2, 1000);
//	System.out.println(list);
//
//	System.out.println(list.contains(500));
	
	
//	System.out.println(list);
//	
//	list.remove(Integer.valueOf(30)); //this will remove the element
//	System.out.println(list);
//	
//	list.clear();
//	System.out.println(list);
	
		
	}

}
