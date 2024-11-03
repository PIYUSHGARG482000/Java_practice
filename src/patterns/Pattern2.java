package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in); 
		int n = sc.nextInt();
		//PATTERN 1 COMPLEX
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*  ");
			}
		System.out.println();
		}
		System.out.println();
		//PATTERN 2 COMPLEX
		int number = 1;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(number + "  ");
				number++;
			}
		System.out.println();
		}
		System.out.println();
		//PATTERN 3 COMPLEX
		int rows = 2*n - 1;
		for(int i=1; i<=rows; i++) {
			if(i <= n) {
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}
			}else {
				for(int j=1; j<=rows-i+1; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//PATTERN 4 COMPLEX
		System.out.println("* ");
		for(int i=2;i<=n-1;i++) {
			System.out.print("* ");
			for(int j=1; j<=i-2; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			System.out.println();
		}	
		if(n>1) {
			for(int i=1; i<=n;i++) {
				System.out.print("* ");
			}
		}
	}

}
