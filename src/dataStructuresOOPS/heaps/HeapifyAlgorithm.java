package dataStructuresOOPS.heaps;

public class HeapifyAlgorithm {
	
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i + 2;
		
		if(left <= n && arr[largest] < arr[left]) {
			largest = left;
		}
		if(right <= n && arr[largest] < arr[right]) {
			largest = right;
		}
		
		//That means the largest element at its best point.
		if(largest != i) {
			swap(arr, i, largest);
			heapify(arr, n ,largest);
		}
		
	}
	
	public static void buildHeap(int arr[], int n) {
		
	/*Reason for taking n/2 is in a Complete Binary tree
	 * the n/2+1 th  to  n th element is already a Leaf node
	 * so leaf nodes are already at correct place so to place the 
	 * correct nodes further we need to process the 1 to n/2 nodes
	 * */
		for(int i=n/2; i>=0; i--) {
			heapify(arr, n , i);
		}
		
	}
	
	public static void heapsort(int arr[], int n) {
		int size = n;
		
		while(size >= 0) {
			swap(arr, 0, size);
			size--;
			heapify(arr, size, 0);
		}		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {54, 53, 55, 52, 50};
		int n = arr.length-1;
		
		buildHeap(arr, n);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
//		buildHeap(arr, n);
		heapsort(arr, n);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
