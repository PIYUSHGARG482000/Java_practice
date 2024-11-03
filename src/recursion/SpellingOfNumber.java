package recursion;
import java.util.*;
public class SpellingOfNumber {

	public static void main(String[] args) {
		Deque<Integer> set = new ArrayDeque<>();
		spelling(1567);
		System.out.println();
		System.out.println(expo(8));
		int a[] = {1, 2, 3};
		Powerset(a,set,0);
	}
	public static void spelling(int n) {
		
		if(n <=0) return;
		String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		spelling(n/10);
		System.out.print(numbers[(n%10)] + " ");
	}
	
	
	public static long expo(int n) {
		if(n == 0) { 
			return 1;
		}
		long ans = expo(n/2);
		if(n%2 != 0) {
			return 2*ans*ans;		
		}else {
			return ans*ans;
		}
	}
	public static boolean isSorted(int[] a, int i) {
		if(i > a.length-1) return true;
		if(a[i] > a[i-1]) return isSorted(a, i+1);
		else return false;
	} 
	public static void Powerset(int a[], Deque<Integer> set, int n) {
		if(n >= a.length) {
			System.out.println(set);
			return;
		}
		
		//Consider a[i]
		set.addLast(a[n]);
		Powerset(a,set,n+1);
		
		//If not considering a[i]
		set.removeLast();
		Powerset(a,set,n+1);
	}

}
