package methods;

public class introduction {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxof(firstNumber, secondNumber);
		System.out.println(result);
		maxof(5);
		
	}
	
   static int maxof(int a, int b) {
		return a > b ? a : b;
	}
   static void maxof(float d) {
		
	}
   static void sayHi() {
	   System.out.println("Hi");
	   System.out.println("Good morning");
   }

}
