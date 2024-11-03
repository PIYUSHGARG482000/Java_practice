package recursion;
import java.util.*;
public class questions {

	//Check if Array is Sorted or not using Recursion method
	public static boolean isSorted(int arr[], int size) {
		//Base case
		if(size == 0) return true;
		
		//Check the logic for the Usortedness
		if(arr[size] < arr[size-1]) return false;
		else {
			//Recursive relation to solve one part and rest is recursive leap of faith
			return isSorted(arr, size-1);
			
		}
	}
	
	
	//Method to compute the sum of array using Recursion method
	public static int getSum(int arr[], int idx, int sum) {
		//Base case
		if(idx == 0) return sum+arr[0];
		
		//Proceesing part to calculate Sum
		int newSum = sum + arr[idx];
		//Recursive Relation to solve one part and rest is recursive leap of faith
		return getSum(arr,idx-1, newSum);	
	}
	
	
	//Linera Search method to find the Target element using Recursion approach
	public static int LinearSearch(int arr[], int idx, int target) {
		//Base case to Stop Recursive calls
		if(idx == arr.length) {
			return -1;
		}
		//Processing part to check the target element
		if(arr[idx] == target) {
			return idx+1;
		}
		//Recursive relation to check the further part of the array
		return LinearSearch(arr,idx+1,target);
	}
	
	public static int BinarySearch(int arr[], int start, int end, int target) {
		
		int mid = start + (end - start)/2;
		
		if(start > end) {
			return -1;
		}
		if(arr[mid] == target) {
			return mid+1;
		}
				
		if(arr[mid] > target) {
			return BinarySearch(arr,start,mid-1,target);
		}else {
			return BinarySearch(arr,mid+1,end,target);
		}
				
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 4, 6, 8, 10, 12, 14};
		
//		boolean ans = isSorted(arr,arr.length-1);
//		int sum = getSum(arr,arr.length-1,0);
//		System.out.println(sum);
//		if(ans) {
//			System.out.println("Array is Sorted.");
//		}else {
//			System.out.println("Array is not sorted");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Element to be searched : ");
		int ele = sc.nextInt();
//				
//		System.out.println("Position of " + ele + " in Array is " + 
//							LinearSearch(arr,0,ele));
		
		System.out.println("Position of " + ele + " in Array is By Linear Search is "
							+ BinarySearch(arr,0,arr.length-1,ele));
		
		
		sc.close();
	}

}
