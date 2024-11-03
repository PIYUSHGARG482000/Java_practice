package dataStructuresOOPS.heap;

public class HeapOperations {
	public static void main(String[] args) {
		int a[] = {40, 30, 10, 20, 15};
		int n = a.length-1;
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After Deletion from Heap");
		deleteHeap(a,n);
		for(int i: a) {
			System.out.print(i + " ");
		}
	}
	public static void deleteHeap(int a[], int n) {
		a[0] =a[n-1];
		n = n-1;
		int i = n;
		while(i > 0) {
			int left = a[2*i];
			int right = a[2*i + 1];
			int largest = left > right ? 2*i : 2*i + 1;
			if(a[i] > a[largest]) {
				swap(a, i, largest);
			}
		}
	}
	
//	public static void InsertHeap(int a[], int n, int ele) {
//		a[n-1] = ele;
//		int i = n;
//		while(i > 0) {
//			int parent = i/2;
//			if(a[i] > a[parent]) {
//				swap(a,i,parent);
//			}else {
//				return;
//			}
//		}
//		for(int j: a) {
//			System.out.print(j + " ");
//		}
//	}
	public static void buildHeap(int a[], int n) {
		for(int i=n/2; i>=0; i--) {
			heap(a,n, i);
		}
	}
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
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
