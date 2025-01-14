package dataStructuresOOPS.comparatorsAndComparable;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Ram"));
		students.add(new Student(35, "Shyam"));
		students.add(new Student(83, "Aman"));
		students.add(new Student(13, "Rohit"));
		students.add(new Student(13, "Piyush"));
		students.add(new Student(57,"Piyush"));
		
//		Collections.sort(students, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name)) {
//					return  o1.marks - o2.marks;
//				}else {
//					return o1.name.compareTo(o2.name);
//				}
//			}	
//
//		});

		//LAMBDA FUNCTION IMPLEMENTATION OF A COMPARATOR
//		Collections.sort(students, (Student o1, Student o2) -> {
//				if(o1.name.equals(o2.name)) {
//					return  o1.marks - o2.marks;
//				}else {
//					return o1.name.compareTo(o2.name);
//				}
//		});
		
//		Collections.sort(students, (o1,o2) -> o1.name.compareTo(o2.name));
		
		Collections.sort(students, Comparator.comparing(Student::getName)
				.thenComparing(Student::getMarks).reversed());
		//lambda function
		students.forEach(System.out::println);
		
	}

}
//class SortByNameThenMarks implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o2.name)) {
//			return  o1.marks - o2.marks;
//		}else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//	
//}