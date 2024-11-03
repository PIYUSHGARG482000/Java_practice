package algorithms;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {-4, -1, 3, 7, 10, 11};
		System.out.println("Enter the Key to Search: ");
		int key = sc.nextInt();
		if(BinaryRecursive(arr,key,0,arr.length-1) == -1) {
			System.out.println("Element Not Found");
		}else {
			System.out.println("Position of " + key + " is " + BinaryRecursive(arr,key,0,arr.length-1));		
		}
	}
	
	//Time Complexity is O(LogN)
	public static int BinarySearching(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key == arr[mid]) return mid+1;
			if(key > arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;		
	}
	
	//By Recursive Approach
	public static int BinaryRecursive(int arr[], int key, int low, int high) {
		
		if(low > high) return -1;
		//Base Case
		int mid = (low+high)/2;
		if(arr[mid] == key) return mid+1;
		
		if(key > arr[mid]) return BinaryRecursive(arr,key,mid+1,high);
		
		return BinaryRecursive(arr,key,low,mid-1);		
	}
	
	
	
}
