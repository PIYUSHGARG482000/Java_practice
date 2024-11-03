package recursion;
import java.util.*;
public class AdvanceRecursion {

	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
//	int a[][] = { {1, 1, 1, 2, 1, 1, 1},
//				  {2, 2, 1, 2, 2, 1, 1},
//				  {0, 2, 2, 2, 1, 1, 1},
//				  {1, 1, 0, 2, 1, 2, 2},
//				  {1, 1, 2, 2, 1, 0, 0}};
//	floodFill(a, 0, 5, 3, 1);
//	DisplayMatrix(a);
//		String s = "abcc";
//		permutation(s, 0, 3);
		
		
		int  a[] = {1, 5, 700, 4};
		System.out.println((CoinMax(a,0,a.length-1)));
		
	}
	
//	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
//		int row = a.length;
//		int col = a[0].length;
//		
//		//Base Condition that represents we are outside the matrix
//		if(r<0 || r >= row || c < 0 || c >= col) {
//			return;
//		}
//		if(a[r][c] != prevFill) {
//			return;
//		}
//		a[r][c] = toFill;
//		//Fill on top of a PREVFILL
//		floodFill(a, r-1, c, toFill, prevFill);
//		//Fill on right of a PREVFILL
//		floodFill(a, r, c+1, toFill, prevFill);
//		//Fill on bottom of a PREVFILL
//		floodFill(a, r+1, c, toFill, prevFill);
//		//Fill on left of a PREVFill
//		floodFill(a, r, c-1, toFill, prevFill);		
//	}
//	static void DisplayMatrix(int a[][]) {
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[0].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}	
//	
//}

//	static void permutation(String s, int l, int r) {
//		if(l == r) {
//			if(set.contains(s)) return;
//			set.add(s);
//			System.out.println(s);
//			return;
//		}
//		for(int i=l; i<=r; i++) {
//			s = interchangeChar(s,l,i);
//			permutation(s,l+1,r);
//			s = interchangeChar(s,l,i);
//		}		
//	}
//	
//	static String interchangeChar(String s, int a , int b) {
//		char[] Array = s.toCharArray();
//		char temp = Array[a];
//		Array[a] = Array[b];
//		Array[b] = temp;
//		return String.valueOf(Array);
//	}
	
	static int CoinMax(int a[], int l , int r) {
		if(l+1 == r) {
			return Math.max(a[l], a[r]);
		}
		
		return Math.max(a[l]+Math.min(CoinMax(a,l+1,r-1), CoinMax(a,l+2,r)), 
					a[r]+Math.min(CoinMax(a,l,r-2), CoinMax(a,l+1,r-1)));
	}
	
	
	
	
}
	