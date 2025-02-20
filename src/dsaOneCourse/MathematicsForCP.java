package dsaOneCourse;

import java.util.Arrays;

public class MathematicsForCP {

	public static void main(String[] args) {
//		boolean isPrime[] = sieveOfEratoSthenes(20);
//		for(int i=0; i<=20;i++) {
//			System.out.println(i + " " + isPrime[i]);
//		}
//		System.out.println(gcd(15,27));
		System.out.println(fastPower(3978432, 5, 1000000007));
	}
	
	static long fastPower(long a , long b, int n) {
		long res = 1;
		while(b > 0) {
			if( (b&1) != 0) {
				res = ((res % n) * (a % n)) % n;
			}
			a = (a % n  * a % n) % n ;
			b = b >> 1;
		}
		return res;
	}
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b,a%b);
	}
	static boolean[] sieveOfEratoSthenes(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i=2; i*i <= n; i++) {
			for(int j=2*i; j<=n; j+=i) {
				isPrime[j] = false;
			}
		}
		
		return isPrime;
	}
}
