package dataStructuresOOPS.sets;
import java.util.*;
public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		
		int[] a = {2, 1, 3, -4, -2};
		int k = -3;
		boolean found = false;
//		
//		for(int i=0; i<a.length; i++) {
//			int sum = 0;
//			for(int j=i; j<a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;				
//					break;
//				}
//				if(found) break;
//				
//			}
//		}
//		System.out.println("found " + found);

		
		//O(N) - time complexity but consumes space complexity
		Set<Integer> set = new HashSet<>();
		int sum=0;
		for(int element: a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
		}
		System.out.println("found " + found);
	}

}
