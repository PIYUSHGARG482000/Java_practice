package recursion;

public class FirstAndLastOccurance {
	
	
	//count first and last Occurance of a element in a string
	public static int first = -1;
	public static int last = -1;
	
	public static void countOccurance(String str, int index, char element) {
		
		if(index == str.length()) {
			System.out.println(first + " " + last);
			return;
		}		
		
		char currElement = str.charAt(index);
		if(currElement == element) {
			if(first == -1) {
				first = index;
			}else {
				last = index;
			}
		}
		countOccurance(str,index+1,element);		
		
	}
	
	//Function to shift all x in last
	public static void shiftAllx(String str, int index, int count, String modified) {
		
		if(index == str.length()-1) {
			
			for(int i=0;i<count; i++) {
				modified += 'x';
			}			
			System.out.println(modified);
			return;
		}		
		char currChar = str.charAt(index);
		
		if(currChar == 'x') {
			count++;
			shiftAllx(str,index+1,count,modified);
		}else {
			modified += currChar;
			shiftAllx(str,index+1,count,modified);
		}		
	}
	//remove duplicates from the string
	public static boolean[] isFound = new boolean[26];
	
	public static void removeDuplicate(String str, int index, String modified) {
		
		if(index == str.length()) {
			System.out.println(modified);
			return;
		}
		char currChar = str.charAt(index);	
		//here currChar - a gives the index of the character positioned in the isFound array
		if(isFound[currChar - 'a'] == true) {
			System.out.println(currChar - 'a');
			removeDuplicate(str,index+1,modified);
		}else {
			modified += currChar;
			isFound[currChar - 'a'] = true;
			System.out.println(currChar - 'a');
			removeDuplicate(str,index+1, modified);
		}	
	}
	
	
	public static void main(String[] args) {
		
//		countOccurance("abaacdaefaah",0,'a');
//		shiftAllx("axbcxxc",0,0,"");
		removeDuplicate("abbccda",0,"");
		
	}
	
}
