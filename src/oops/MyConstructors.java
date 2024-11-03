package oops;

class vehicle{
	
	int wheels;
	int headlights;
	String color;

	vehicle(int wheels){ 
		//wheels = noOfWheels;
		this.wheels = wheels;
		headlights = 2;
	}
	
	vehicle(int wheels, String color){ //CONSTRUCTOR OVERLOADING
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
}


public class MyConstructors {

	MyConstructors(){ //NO-ARGUMENT CONSTRUCTOR
		System.out.println("Object is now created");
	}
	
	public static void main(String[] args) {
		
		vehicle car = new vehicle(4);
		vehicle scooty = new vehicle(2);
		
		vehicle erickshaw = new vehicle(3,"Yellow");
		
		//vehicle random = new vehicle(); //UNDEFINED CANNOT CALL DEFAULT CONSTRUCTOR AFTER CREATING CONSTRUCTOR
		
		System.out.println(erickshaw.wheels + " wheels and color is " + erickshaw.color);
	}

}
