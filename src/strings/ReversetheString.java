package strings;

import java.util.Scanner;

public class ReversetheString {

	public static String reverse(int idx, String s, String rev) {
		if(idx < 0) {
			return rev;
		}
		return reverse(idx-1, s, rev+s.charAt(idx));
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String s = sc.nextLine();
		int i = s.length()-1;
		
		System.out.println(reverse(i,s,""));
	}

}
