package patterns;

import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in); 
		int n = 5;
		//PATTERN 1
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//PATTERN 2
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//PATTERN 3
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<n-i+1; j++) {
				System.out.print("* ");
			}
		    System.out.println();
		}
		System.out.println();
		//PATTERN 4
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		//PATTERN 5
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=0; j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		System.out.println();
		
		//PATTERN 6
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("  ");
			}
			for(int z=0; z<2*i+1; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
	
		//PATTERN 7
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			for(int z=0; z<(n-i)*2-1; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//PATTERN 8
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			for(int z=0; z<(n-i)*2-1; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("  ");
			}
			for(int z=0; z<2*i+1; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//PATTERN 9
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		System.out.println();
		
		//PATTERN 10
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=0; j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<=n-i+1; j++) {
				System.out.print("* ");
			}
		    System.out.println();
		}
	}

}
