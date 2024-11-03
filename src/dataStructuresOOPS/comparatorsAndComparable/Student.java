package dataStructuresOOPS.comparatorsAndComparable;

public class Student implements Comparable<Student> {
	
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student marks= " + marks + ", name = " + name;
	}
	
	public int getMarks() {
		return this.marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
//	@Override
//	public int compareTo(Student obj) {
//		return this.marks - obj.marks;
//	}
	
	
	
}
