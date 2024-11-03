package binarySearch;

public class SearchInSortedAndRotated {
	
	public static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		int mid = start + (end - start)/2;
		
		while(start < end) {
			if(arr[mid] >= arr[0]) { //Comparing the increase phase elements and updating start closer to the pivot
				start = mid + 1;
			}else {
				end = mid;
			}
			mid = start + (end - start)/2;
		}
		return start;  // OR  return end		
	}
    
    public static int binarySearch(int[] arr, int start, int end, int key){
        int mid = start + (end - start)/2;
        
        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;        
    }
    
    public static int search(int[] nums, int target) {
        int pv = pivot(nums);
        if(target >= nums[pv] && target <= nums[nums.length-1]){
            return binarySearch(nums,pv,nums.length-1,target);
        }else{
            return binarySearch(nums,0,pv-1,target);
        }
    }
    
    
    
    //Recursion approach   
    public static int BS(int arr[], int start, int end, int key) {
    	
    	if(start > end) {
    		return -1;
    	}
    	int mid = start + (end - start)/2;
    	if(arr[mid] == key) {
    		return mid;
    	}
    	
    	if(arr[mid] > key) {
    		return BS(arr, start, mid-1,key);
    	}else {
    		return BS(arr, mid+1, end, key);
    	}
    }
    
    public static int PV(int arr[], int start, int end) {
    	if(start == end) {
    		return start;
    	}    	
    	int mid = start + (end - start)/2;
    	
    	if(arr[mid] >= arr[0]) {
    		return PV(arr,mid+1,end);
    	}else {
    		return PV(arr,start,mid);
    	}
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,0,1,2};
		System.out.println(search(arr,7));

	}

}
