package methods;

public class PassByValue {

	public static void main(String[] args) {
//		int c= 34, d=32;
//		System.out.println(c + " " + d);
//		swap(c,d);
	
//		Dog c= new Dog();
//		c.legs = 4;
//		Dog d= new Dog();
//		d.legs = 3;
//		swap(c,d);
		
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
		System.out.println(c.legs + " " + d.legs);

	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
	}
	static void changeDog(Dog dog) {
		dog.legs = 6;
	}
}

class Dog{
	int legs;
}
