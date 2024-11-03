package algorithms;

public class BubbleSort {

	public static void main(String[] args) {
	
		int a[]	 = {4, 3, 7, 1, 5, 8, 11, 6};
		for(int i: a) System.out.print(i + " ");
		System.out.println();
		System.out.println("After Bubble Sort");
		BubbleSorting(a);
		for(int i: a) System.out.print(i + " ");
		System.out.println();
	}
	public static void swap(int arr[], int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	//Bubble sort using Recursion Technique
	public static void Bubblesort(int arr[], int n) {
		//Base case - If array has one or not elements then its already sorted
		if(n==0 || n==1) {
			return;
		}
		//On every Iteration one element of array is placed to its correct spot
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				swap(arr,i,i+1);
			}
		}
		//As one element is placed perfectly then size of un-sortedness of an array is reduced
		Bubblesort(arr,n-1);
	}
	
	
	//Time Complexity of Bubble Sort is O(N^2) on every case
	public static int[] BubbleSorting(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		return a;
	}
}
