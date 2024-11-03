package loops;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number for Factorial: ");
		int n = sc.nextInt();
		int factorial = 1;
		
		int temp = n;
		
		while(temp>0) {
			factorial *= temp;
			temp--;
		}
		System.out.println("Factorial of " + n + " is " + factorial);
	}

}
