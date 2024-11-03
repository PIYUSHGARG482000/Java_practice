package recursion;
import java.util.*;
public class FibonnaciByRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("0 " + "1 ");
		fib(n,0,1);
		System.out.println();
		System.out.println(fibonnaci(n));
		
		sc.close();
	}
	//Its takes 0th term as well
	public static int fibonnaci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
//		System.out.print((n-1) + (n-2) + " ");
		return fibonnaci(n-1) + fibonnaci(n-2);
	}
	//Oth Term as well
	public static void fib(int n, int a, int b) {
		if(n == 1) {
			return;
		}
		System.out.print(a + b + " ");
		fib(n-1, b, a + b);
	}
	
	public static void fibonaci(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for(int i=0; i<n-2; i++) {
			int c = a + b;
			System.out.println(c  + " ");
			a = b;
			b = c;
		}
	}
	
}
