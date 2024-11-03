package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
//		int dayOfWeek = 2;
//		
//		switch(dayOfWeek) {
//		case 1:
//			System.out.println("I'm on a Leave.");
//			break;
//		case 2:
//			System.out.println("I'm in a Office.");
//			break;
//		case 3:
//			System.out.println("I'm playing football.");
//			break;
//		default:
//			System.out.println("I don't know what day is?.");
//		}
		
		int rating = 1;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad Review");
			break;
		case 3:
			System.out.println("Average Review");
			break;
		case 4:
		case 5:
			System.out.println("Good Review");
			break;
		}
		
	}

}
