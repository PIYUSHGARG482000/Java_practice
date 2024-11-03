package dynamicProgramming;

import java.util.Arrays;

public class minCoinsToFormNamount {

	public static void main(String[] args) {
		int n = 18;
		int a[] = {7,5,1};
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		System.out.println(minCoins(n,a,dp));
	}
	//Time Complexity O(m^n) where m is the size of array a of no. of coins
	static int minCoins(int n, int a[],int dp[]) {
		
		if(n == 0) return 0;
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(n-a[i] >= 0) {
				int SubAns = 0;
				if(dp[n-a[i]] != -1) {
					SubAns = dp[n-a[i]];   //By using memory we can store the result in dp array
				}else {
				    SubAns = minCoins(n-a[i],a,dp);
				}
				if(SubAns != Integer.MAX_VALUE && SubAns + 1 < ans) {
					ans = SubAns + 1;
				}
			}
		}
		return dp[n] = ans;
	}
	//Optimized using DP
	//By using the dp array we can use memory to get rid of Repeated calculation

}
