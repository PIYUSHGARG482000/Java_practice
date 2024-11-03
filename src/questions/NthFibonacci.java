package questions;

import java.util.Arrays;

public class NthFibonacci {

	//Time Complexity of O(n)
	public static long method1(long n) {
		long a = 0;
		long b = 1;
		long c;
		
		if(n == 0) return 0;
		
		for(long i=2; i<=n; i++) {
			c = (a + b)%1000000007;
			a = b;
			b = c;
		}
		return b%1000000007;
	}
	
	
	//Using Recursion Tree with O(n)
	public static long method2(long n) {
		if(n <= 1) return n;
		return (method2(n-1) + method2(n-2))%1000000007;
	}
	
	//Using concept of Memorization OR Dynamic Programming we can shift the 
	//Time complexity of Nth Fibonnaci to O(n)  -->  O(log n)
	public static long method3(int n, long dp[]) {
		if(n <= 1) return n;
        long first, second;
        if(dp[n-1] != -1){
            first = dp[n-1];
        }else{
            first = method3(n-1,dp);
        }
        if(dp[n-2] != -1){
            second = dp[n-2];
        }else{
            second = method3(n-2,dp);
        }
        //Memorization
        return dp[n] = (first + second)%1000000007;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 90;
		long dp[] = new long[n+1];
		Arrays.fill(dp, -1);
		System.out.println(method3(n,dp));
	}

}
