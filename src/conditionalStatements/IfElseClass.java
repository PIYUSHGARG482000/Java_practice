package conditionalStatements;

public class IfElseClass {

	public static void main(String[] args) {
		
//		int noOfPetals = 5;
//		
//		if(noOfPetals % 2 == 0) {
//			System.out.println("He Loves me not.");
//		}else {
//			System.out.println("He Loves me.");
//		}
		
		//TERNARY OPERATOR
		int a =15;
		int b = 8;
		
		int maxOfBotNumbers = 0;
		
		if(a > b) {
			maxOfBotNumbers = a;
		}else {
			maxOfBotNumbers = b;
		}
			
		maxOfBotNumbers = a > b ? a : b;
		

	}

}
