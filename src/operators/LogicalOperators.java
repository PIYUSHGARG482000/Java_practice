package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int grade = 11;
		
		if(!(grade == 10 | grade == 12)) {
			System.out.println("You can not give board exams now.");
		}

	}

}
