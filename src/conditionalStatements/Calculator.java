package conditionalStatements;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number :");
		int b = sc.nextInt();

		System.out.print("Enter Operation to be Performed : ");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0; 
		switch(operation) {
		case '+':
			 result = a + b;
			 break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			 break;
		case '/':
			result = a / b;
			 break;
		default:
			System.out.println("Invalid Operation");
		}
		System.out.println("The Result is " + result);
	}12
	
}
