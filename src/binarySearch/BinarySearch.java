package binarySearch;
import java.util.*;
public class BinarySearch {

	//Binary Search using BruteForce approach
	public static int BinarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = start +(end - start)/2; 
		int ans = 0;
		while(start <= end)
		{
			if(arr[mid] == target) {
				ans = mid+1;
				break;
			}
			if(arr[mid] > target) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
			mid = start + (end - start)/2;
		}
		if(ans == 0) return -1;
		return ans;
	}
	
	public static void print(int arr[], int s, int e) {
		for(int i=s; i<=e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	//Binary Search using Recursion approach
	public static int BS(int arr[], int start, int end, int target) {
		
		if(start > end) return -1;
		print(arr,start,end);
		
		int mid = start + (end - start)/2;
		System.out.println("Mid of Array is " + arr[mid]);
		if(arr[mid] == target) {
			return mid+1;
		}
		if(arr[mid] > target) {
			return BS(arr, start, mid-1, target);
		}else {
			return BS(arr, mid+1, end, target);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 22};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Element to be Searched: ");
		int ele = sc.nextInt();
		
		System.out.println("Search using BruteForce " + BinarySearch(arr,ele));
		System.out.println("Search using Recursion " + BS(arr,0,arr.length-1,ele));
	}

}
