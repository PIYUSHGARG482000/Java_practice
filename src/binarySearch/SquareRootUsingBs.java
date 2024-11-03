package binarySearch;
import java.util.*;
public class SquareRootUsingBs {
	
	
	//Using Binary Search that's why its Time complexity is O(log n)
	public static int squareRoot(int n) {
		int start = 2;
		int end = n/2;
		
		if(n == 0) return 0;
		if(n < 4) return 1;
		
		int mid = start + (end - start)/2;
		
		while(start < end) {
			//to find the square root which is possible an answer
			if(mid <= n/mid && (mid+1) > n/(mid+1)) {
				return mid;
			}
			else if(mid < n/mid) {
				start = mid + 1;
			}
			else if(mid > n/mid) {
				end = mid - 1;
			}
			mid = start + (end - start)/2;
		}
		return start;
	}
	public static double morePrecise(int n, int precision, int tempSol) {
		float factor = 1;
		double ans = tempSol;
		for(int i=0; i<precision; i++) {
			factor /= 10;
			for(double j=ans; j*j<n; j=j+factor) {
				ans = j;
			}
		}		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tempSol = squareRoot(n);
		int precision = sc.nextInt();
		System.out.println(morePrecise(n,precision,tempSol));
		sc.close();
	}

}
