package loops;

import java.util.Scanner;


public class Break {

	public static void main(String[] args) {
//		for(int i=0; i<=100; i++) {
//			System.out.println(i);
//			if(i == 35) {
//			  break;
//			}
//		}
		Scanner sc = new Scanner(System.in);
		for(;;) {		//Infinite Loop
			int n = sc.nextInt();
			if(n<0) {
				break;
			}
		}

	}

}
