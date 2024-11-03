package oops.interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		Person Obj = new Person();
		Obj.study();
		Obj.makeVedio();
		
		Youtuber obj2 = Obj;
		obj2.editVedio();
		obj2.makeVedio();
	}

	@Override
	public void study() {
		System.out.println("Person is Studying.");
		
	}

	@Override
	public void makeVedio() {
		System.out.println("Person is making a Good Vedio");
		
	}

	@Override
	public void editVedio() {
		
		
	}

}
