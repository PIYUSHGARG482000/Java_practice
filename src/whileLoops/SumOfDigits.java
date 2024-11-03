package whileLoops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Number for Sum:  ");
//		int n = sc.nextInt();
//		int temp = n;
//		int sum = 0;
//		while(temp>0) {
//			sum += temp%10;
//			temp /= 10;
//		}
//		System.out.println("The sum of " + n + " is "+ sum);
		
		System.out.print("Enter the Decimal Number: ");
		int number = sc.nextInt();
		String binary = Integer.toBinaryString(number);
		System.out.println("Binary will be " + binary);
//		int NumberOfDigits = (int)Math.log10(n) + 1;	//TO FIND NUMBER OF DIGITS IN A NUMBER
//		System.out.println(NumberOfDigits);
	}

}
