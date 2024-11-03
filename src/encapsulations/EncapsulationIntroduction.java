package encapsulations;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		
		Student obj = new Student();
//		obj.name = "Tom";
//		obj.age = 17;
		obj.setAge(12);
		
		System.out.println(obj.getAge());
	}

}
