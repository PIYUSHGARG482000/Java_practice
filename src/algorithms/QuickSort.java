package algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int a[]	 = {4, 3, 7, 1, 5, 8, 11, 6, 9, 9, 9, 9};
		for(int i: a) System.out.print(i + " ");
		System.out.println();
		System.out.println("After Quick Sort");
		quicksort(a, 0, a.length-1);
		
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	//Quick Sort bears of Time Complexity of 
	//O(N*logN) in Best Case
	//O(N^2) in Worst Case
	//O(N) space Complexity
	//By Recursion is Repeats the process until the l > h
	static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1, high);
        }
    }
    static int partition(int arr[], int s, int e)
    {
        // your code here
    	int pivot = arr[s];
    	int cnt = 0;
    	for(int i=s+1; i<=e; i++) {
    		if(arr[i] <= pivot) {
    			cnt++;
    		}
    	}
    	//place pivot to the right position in an array
    	int pivotIndex = s + cnt;
    	swap(arr, s,pivotIndex);
    	
    	int i = s;
    	int j = e;
    	while(i < pivotIndex && j > pivotIndex) {
    		while(arr[i] <= arr[pivotIndex]) {
    			i++;
    		}
    		while(arr[j] > arr[pivotIndex]) {
    			j--;
    		}
    		
    		if(i < pivotIndex && j > pivotIndex) {
    			swap(arr,i++,j--);
    		}
    	}
    	return pivotIndex;
    }	
	public static void swap(int a[], int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}

	
	public static void quicksort(int arr[], int s, int e) {
		
		//Base case when there is only one or no element left in the array
		if(s >= e) return;
		
		//Partition of an array
		int pivot = partition(arr,s,e);
		
		//then left part of the array
		quicksort(arr,s,pivot-1);
		
		//right part of the array
		quicksort(arr,pivot+1,e);
	}
	
}
