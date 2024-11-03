package binarySearch;

public class PivotElement {
	
	//As we apply the Binary Search method so Its Time Complexity is O(log n)
	public static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		int mid = start + (end - start)/2;
		
		while(start < end) {
			if(arr[mid] >= arr[0]) { 
/*Comparing the increase phase elements and 
 * updating start closer to the pivot
 */				start = mid + 1;
			}else {
				end = mid;
			}
			mid = start + (end - start)/2;
		}
		return start;  // OR  return end		
	}
	//Method to find the pivot element in a wave Array using Recursion method
	public static int PV(int arr[], int start, int end) {
		//Base case
		if(start == end) {
			return start;
		}
		//Processing part to calculate mid
		int mid = start + (end - start)/2;
		//Processing for Pivot element with Binary Search approach
		if(arr[mid] >= arr[0]) {
			//Recursive relation for the Recursion call
			return PV(arr,mid+1,end);
		}
		else {
			//Recursive relation for the Recursion call
			return PV(arr,start,mid);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {50, 60, 90, 100, 110, 10, 20, 30, 40};
		
		System.out.println("Pivot Element is " + arr[PV(arr,0,arr.length-1)]);
	}
}
