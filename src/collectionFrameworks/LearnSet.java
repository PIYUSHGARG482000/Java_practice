package collectionFrameworks;
import java.util.*;
public class LearnSet {

	public static void main(String[] args) {
		
//		Set<Integer> set = new LinkedHashSet<>();
//		Set<Integer> set = new HashSet<>();
	
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student("Piyush",2));
		studentSet.add(new Student("Amit",3));
		studentSet.add(new Student("Shivam",4));
		
		studentSet.add(new Student("Rohit",2));
		System.out.println(studentSet);
		
//		set.add(32);
//		set.add(2);
//		set.add(54);
//		set.add(21);
//		set.add(65);
//		
//		set.remove(54);
//		
//		System.out.println(set);
//		
//		System.out.println(set.contains(21));
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		set.clear();
//		System.out.println(set);
	}

}
