package questions;
import java.util.*;
public class PowerSetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> set = new ArrayDeque<>();
		int[] A = {1, 2, 3, 4, 5};
		int n = 0;
		PowerSet(A, set, n);
//		String S = "abc";
//		int n = 0;
//		StringSet(S, set, n);
		
	}
	public static void PowerSet(int[] A, Deque<Integer> set, int n) {
		if(n >= A.length) {
			System.out.println(set);
			return;
		}
		//If  A[i] considered
		set.addLast(A[n]);
		PowerSet(A, set, n+1);
		
		//If A[i] not Considered
		set.removeLast();      //Backtracking to remove element 
		PowerSet(A,set,n+1);
	}
	
	public static void StringSet(String S, Deque<Character> setChar, int n) {
		if(n >= S.length()) {
			System.out.println(setChar);
			return;
		}
				
		//If char is considered
		setChar.addLast(S.charAt(n));
		StringSet(S, setChar, n+1);
		
		//If char is not considered
		setChar.removeLast();
		StringSet(S, setChar, n+1);
				
	}
	
	
	

}
