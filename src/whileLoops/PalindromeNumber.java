package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number for Palindrome:  ");
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		while(temp>0) {
			reverse = reverse*10 + (temp%10);
			temp /= 10;
		}
		if(reverse == n) {
			System.out.println(n + " is a Palindrome Number");
		}else {
			System.out.println(n + " is not a Palindrome Number");
		}
		
	}

}
