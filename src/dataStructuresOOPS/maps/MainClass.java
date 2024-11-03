package dataStructuresOOPS.maps;
import java.util.*;
import java.util.Map.Entry;
public class MainClass {

	public static void main(String[] args) {
		
	Map<String, Integer> numbers = new HashMap<>();
	
//	numbers.put("one", 1);
//	numbers.put("two", 2);
//	numbers.put("eight", 8);
//	numbers.remove("two", 4);
//	
//	
//	System.out.println(numbers);
//	System.out.println(numbers.entrySet());
//	
//	Set<Entry<String, Integer>> entries = numbers.entrySet();
//	
//	for(Entry<String, Integer> entry: numbers.entrySet()) {
//		entry.setValue(entry.getValue() * 100);
//	}
//	
//	System.out.println(numbers);
	
//	superDigit("148", 3);
	
	
	System.out.println(reverseWords("i.like.this.program.very.much"));
	
	
	}
//	public static int getHash(String s) {
//		int hash = 0;
//		for(int i=0; i<s.length(); i++) {
//			hash += s.charAt(i);
//		}	
//		return hash;
//	}
	
	 public static int superDigit(String n, int k) {
		    // Write your code here
		    int i = 0;
		 	while(i<k) {
		    	n = n + n;
		    	i++;
		    }
		    long num = Integer.valueOf(n);
		    int sum = sumOfDigit(num,0);
		    return sum;
	}
		    
	 public static int sumOfDigit(long num,int sum){
		  if(num > 10){
		      return sum + sumOfDigit(num%10,sum);
		  }
		  return sum;
	 }
	
	public static String reverseWords(String S)
	    {
	        String[] rev = S.split(".");
	        String reversed = "";
	        for(String s: rev){
	            reversed.concat(s.substring(s.length()-1));
	        }
	        return reversed;
	    }
	

}
