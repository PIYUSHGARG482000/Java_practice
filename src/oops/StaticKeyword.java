package oops;

import oops.Person.B;
import oops.Person.C;

public class StaticKeyword {
		
	public static void main(String[] args) {
		
//		Person obj = new  Person();
//		B objB = obj.new B(); //B class is tighly-coupled in Person Class
//		
//		C objc = new C();//Class C is of type static which is not tightly coupled
//		
		System.out.println("Inside Main");
		
	}
	
	static {
		System.out.println("In Block 1");
	}
	static {
		System.out.println("In Block 2");
	}
}

