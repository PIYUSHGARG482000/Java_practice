package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		//Automatic TypeCasting
		byte x = 4;
		double y = x;
		System.out.println(x);
		System.out.println(y);
		
		//Manual TypeCasting(Narrowing)
		double myDouble = 2.83462;
		int myint = (int)myDouble;
		System.out.println(myDouble);
		System.out.println(myint);
	}

}
