package oops.inheritance;

public class Person {
	
	protected String name;
	public Person(String name) {
		this.name = name;
		System.out.println("Inside Person Constructor");
	}
	
	 public void walk() {
		 System.out.println("person " + name +" is walking.");
	 }
	 
	 public void eat() {
		 System.out.println("person " + name + " is Eating.");
	 }
	 
	 public static void laughing() {
		 System.out.println("Person " + name + " is laughing");
	 }

}
