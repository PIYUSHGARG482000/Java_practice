package recursion;
import java.util.*;
public class PermutationsOfString {

	
	public static void printPermut(String str, String combination) {
		//Base case if Str length become 0 then print that combination  
		if(str.length() == 0) {
			System.out.println(combination);
			return;
		}	
		for(int i=0;i<str.length(); i++) {
			char currChar = str.charAt(i);
			//create new string for choice of individual character Recursively
			String newStr = str.substring(0,i)+str.substring(i+1);
			printPermut(newStr, combination+currChar);
		}
	}
	
	//Find No. of ways to Call guest in a Party wheather Single or else in a Pair's
	public static int callParty(int n) {
		
		//If only 1 or less than guest remaining then there is only one way
		if(n <= 1) {
			return 1;
		}
		
		//for single call
		int way1 = callParty(n-1);
		
		//for Pair's call
		int way2 = (n-1) * callParty(n-2); //because n-1th person chose their partner from remaining Guests
		
		return way1 + way2;
	}
	
	
	
	//Find all possible subsets of N natural numbers
	
	public static void printSubset(ArrayList<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void subsets(int n, ArrayList<Integer> list) {
		if(n == 0) {
			printSubset(list);
			return;
		}
		
		//if considered
		list.add(n);
		subsets(n-1,list);
		
		//if not considered
		list.remove(list.size()-1);
		subsets(n-1,list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermut("abc","");
		
//		System.out.println(callParty(5));
//		ArrayList<Integer> list = new ArrayList<>();
//		subsets(5,list);
	}

}
