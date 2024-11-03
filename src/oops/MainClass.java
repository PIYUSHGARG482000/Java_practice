package oops;

class Cat{
	//PROPERTIES OR STATES OF A CAT
	boolean hasFur;
	String color,breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is Walking.");
	}
	public void eat() {
		System.out.println("Cat is Eating.");
	}
	public void description() {
		System.out.println("My cat has " + legs + " legs and " + eyes + " eyes");
	}
}

class Dog{
	
	String breed, name;
	
	public void jump() {
		System.out.println("My Dog " + name + " jumped.");
	}
	public void description() {
		System.out.println("My dog name is " + name + " and it's breed is " + breed );
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();  //OBJECT OF CAt CLASS
//		Cat cat2 = new Cat();
//		
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		cat2.legs = 4;
//		cat2.eyes = 1 ;
//		
//		cat1.description();
//		cat2.description();
	
		Dog huskey = new Dog();
		Dog poodle = new Dog();
		
		huskey.name = "Huskey";
		huskey.breed = "Sibarian";
		huskey.description();
		huskey.jump();
		
		poodle.name = "Mr. Mool Chand JI";
		poodle.breed = "Poodal";
		poodle.description();
		poodle.jump();
	
	}

}
