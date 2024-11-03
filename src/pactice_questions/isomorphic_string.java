package pactice_questions;

import java.util.HashMap;
import java.util.*;

public class isomorphic_string {

	
	public static boolean isIsomorphic(String a , String b) {
		if(a.length() != b.length()) return false;
		
		if(a.length() == 0 && b.length() == 0) return true;
		
		if(a == null || b == null) return false;
		
		
		HashMap<Character, Character> maping = new HashMap<>();
		
		for(int i=0; i<a.length(); i++) {
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);
			
			Character c = maping.get(c2);
			
			if(c == null || c != c1) return false;
			else if(maping.containsKey(c1)) {
				if(c2 != maping.get(c1)) return false;
			}
			else {
				maping.put(c1, c2);
			}
		}		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "egg";
		String b = "add";
		
		//Programme to check two Strings are isomorphic
		//A string is said to be isomorphic if we change a character in a string then it will 
		//become string b.
		System.out.println(isIsomorphic(a, b));
		
	}

}
