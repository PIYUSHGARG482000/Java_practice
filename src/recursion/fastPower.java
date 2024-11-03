package recursion;

import java.util.Scanner;

public class fastPower {

	
	public static long fastPow(long x, long n) {
		
		//Base Case
		if(n == 0) return 1;
		if(x == 0) return 0;
		
		//Method of Fast power decreases the OverAll MemoryStack Height to logN
		if(n%2 == 0) {
			return fastPow(x,n/2)*fastPow(x,n/2);
		}else {
			return fastPow(x,n/2)*fastPow(x,n/2)*x;
		}
	}
	public static long power(long a, long b) {
		
		if(b == 0) return 1;
		if(b == 1) return a;
//		if(a == 0) return 0;
		
		//even
		if((b&1) == 0) {
			return power(a,b/2)*power(a,b/2);
		}
		//odd
		else {
			return a*power(a,b/2)*power(a,b/2);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number for Power: ");
		long a = sc.nextLong();
		
		System.out.println("Enter the " + a + " raised to the power: ");
		long b = sc.nextLong();
		System.out.println(power(a,b));
		sc.close();
	}

}
