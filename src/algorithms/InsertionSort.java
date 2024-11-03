package algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]	 = {4, 3, 7, 1, 5, 8, 11, 6};
		for(int i: a) System.out.print(i + " ");
		System.out.println();
		System.out.println("After Insertion Sort");
		for(int i: InsertionSorting(a)) {
			System.out.print(i + " ");
		}
	}
	public static void Insertion(int arr[], int n) {
		
	}
	
	
	
	//Time complexity of Insertion sort is O(N^2)
	public static int[] InsertionSorting(int a[]) {
	
	for(int i=1; i<a.length; i++) {
		int current = a[i];
		int j = i-1;
		
		while(j>=0 && current < a[j]) {
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = current;
	}
	return a;
	
	}
}
