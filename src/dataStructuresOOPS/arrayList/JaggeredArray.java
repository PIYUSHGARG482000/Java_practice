package dataStructuresOOPS.arrayList;
import java.util.*;
public class JaggeredArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows for Jaggered Array ");
		int rows = sc.nextInt();
		
		int arr[][] = new int[rows][];  //Declaration of jaggered array
		int count = 1;
		
		//Creating Individual Linear array of Distinct size in a 2D array
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = count++;
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
