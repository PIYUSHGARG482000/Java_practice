package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter First No.: ");
		int a = sc.nextInt();
		System.out.print("Enter Second No.: ");
		int b = sc.nextInt();
		System.out.print("Enter Third No.: ");
		int c = sc.nextInt();
		
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b > c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
		
		int result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println(result);
	}

}
