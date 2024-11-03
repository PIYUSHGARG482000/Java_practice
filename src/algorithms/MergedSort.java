package algorithms;

public class MergedSort {

	//Time complexity of Conquer in MergeSort is O(n)
	public static void conquer(int[] arr, int start, int mid, int end) {
		int[] merged = new int[end - start + 1];
		
		int idx1 = start;
		int idx2 = mid + 1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= end) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			}else {
				merged[x++] = arr[idx2++];
			}
		}
		
		//If some elements after comparison left
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		
		while(idx2 <= end) {
			merged[x++] = arr[idx2++];
		}
		//Copying the sorted array in Original array
		for(int i=0,j=start; i<merged.length; i++,j++) {
			arr[j] = merged[i];
		}
				
	}
	
	public static void divide(int[] arr, int start, int end) {
		
		if(start >= end) {
			return;
		}		
		int mid = start + (end - start)/2;
		divide(arr, start, mid);
		divide(arr,mid+1,end);
		conquer(arr,start,mid,end);		
	}
	

	
	//Time complexity of MergeSort is O(n*log n) [conquer(n) * divide(log n)]
	//Using Divide and Conquer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,1,-2,7,2,0};
		int n = arr.length;
		divide(arr,0,n-1);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}
    
}
