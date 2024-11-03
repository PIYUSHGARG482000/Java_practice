package loops;
import java.util.Scanner;

public class Fibonnaci {
	public static void fib(int a, int b, int n) {
		
		if(n == 0) return;
		int c = a+b;
		System.out.print(c + " ");
		fib(b,c,n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Terms : ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		
//		for(int i=0; i<n-2; i++) {
//			int c = a + b;
//			System.out.print(c+" ");
//			a = b;
//			b = c; 
//		}
		
		System.out.print(a + " " + b + " ");
		fib(a,b,n-2);
		
	}

}
