package recursion;
import java.util.*;
public class SubsequenceOfStrings {

	
	//Time complexity is O(2^n)
	public static void printSubSeq(String str, int index, String curr, HashSet<String> set) {
		
		if(index == str.length()) {
			if(!set.contains(curr)) {
				System.out.println(curr);
				set.add(curr);
				return;
			}else {
				return;
			}                 
		}
		
		printSubSeq(str,index+1, curr+str.charAt(index),set);
		printSubSeq(str,index+1, curr,set);
	}
	
	
	public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void keypadcomb(String str, int index, String combination) {
		
		if(index == str.length()) {
			System.out.println(combination);
			return;
		}
				
		char currChar = str.charAt(index);
		String mapString = keypad[currChar - '0'];
		for(int i=0; i<mapString.length(); i++) {
			keypadcomb(str,index+1,combination+mapString.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> set = new HashSet<>();		
//		printSubSeq("aaaaaaaab",0,"",set);
		
		keypadcomb("2",0,"");
	}

}
