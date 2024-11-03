package binarySearch;

public class AllocateMinimumPages {
	
	public static boolean isPossible(int[] arr, int m, int mid) {
		int studentCount = 1;
		int pagesCount = 0;
		
		for(int i : arr) {
			if(pagesCount + i <= mid) {
				pagesCount += i;
			}else {
				studentCount++;
				if(studentCount > m || i > mid) { //If studentCount is greater than mid OR if current page is greater than mid then no solution is possible
					return false;
				}
				pagesCount = i;
			}
		}
		return true;		
	}
	
	public static int minimumPages(int[] arr, int m) {
		int start = 0;
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		int end = sum;
		int ans = -1;
		int mid = start + (end - start)/2;
		while(start <= end) {
			if(isPossible(arr,m,mid)) {
				ans = mid;
				end = mid - 1;  //As we have to find the minimum pages that's why we have to shrink our search in the range 
			}else {
				start = mid + 1;
			}
			mid = start + (end - start)/2;
		}
		return ans;		
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 15, 5};
		System.out.println("Minimum pages Required in the Distribution among students is \n" + 
		minimumPages(arr,2));

	}

}
