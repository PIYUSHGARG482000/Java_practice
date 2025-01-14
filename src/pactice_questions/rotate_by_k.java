package pactice_questions;

public class rotate_by_k {
	
	//Nave approach
	public static void rotate(int a[], int k) {
		if(k > a.length) {
			k = k%a.length;
		}
		
		int result[] = new int[a.length];
		
		//taking K moves 
		for(int i=0; i<k; i++) {
			result[i] = a[a.length-k+i];
		}
		//copying rest of array excluding k moves
		int j=0;
		for(int i=k; i<a.length; i++) {
			result[i] = a[j++];
		}
		
		System.arraycopy(result, 0, a, 0, result.length);
	}
	
	//by swaping or Bubble sort technique
	public static void bubble_rotate(int a[], int k) {
		for(int i=0; i<k; i++) {
			for(int j=a.length-1; j>=0 & j-1>=0; j--) {
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7};
		int k = 4;
		
		System.out.println("Array before " + k + " moves :");
		for(int i : a) System.out.print(i + " ");
		
		bubble_rotate(a,k);
		System.out.println();
		
		System.out.println("Rotated Array after " + k + " moves :");
		for(int i : a) System.out.print(i + " ");
		
	}

}
