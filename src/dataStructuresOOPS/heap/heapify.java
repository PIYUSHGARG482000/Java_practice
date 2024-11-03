package dataStructuresOOPS.heap;

public class heapify {
		//heapify Algorithm to Convert Array into MAXHEAP by using Recursion.
	public static void main(String[] args) {
		int a[] = {20, 10, 30, 5, 50, 40};
		int n = a.length-1;
		
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("After Heapify Algo");
		System.out.println();
		buildheap(a,n);
		
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After Heap Sort");
		heapsort(a,n);
		System.out.println();
		for(int i: a) {
			System.out.print(i + " ");
		}
		
	}
	public static void heapsort(int a[], int n) {
		for(int i=n; i>=0; i--) {
			swap(a, 0, i);
			heap(a, i-1, 0);
		}
	
	}	
	//function to create heap
	public static void buildheap(int a[], int n) {
		for(int i=n/2; i>=0; i--) {
			heap(a,n,i);
		}
	}
	//function is to Just convert the subtree into a MAXHEAP
	public static void heap(int a[], int n, int i) {
		int largest = i;
		int left = 2*i;
		int right = (2*i)+1;
		if(left <=n && a[left] > a[largest]) {
			largest = left;
		}
		if(right <=n && a[right] > a[largest]) {
			largest = right;
		}
		if(largest != i) {
			swap(a, i, largest);
			heap(a, n, largest);
		}
	
	}
	//funtion to swap of elements
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
		
}
