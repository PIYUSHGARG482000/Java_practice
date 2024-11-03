package algorithms;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]	 = {4, 3, 7, 1, 5, 8, 11, 6};
		for(int i: a) System.out.print(i + " ");
		System.out.println();
		System.out.println("After Selection Sort");
		for(int i: SelectionSorting(a))	System.out.print(i + " ");		
	}
	public static int[] SelectionSorting(int a[]){
		for(int i=0; i<a.length-1;i++) {
			int min = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}
		
	public static void swap(int a[], int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}
}
