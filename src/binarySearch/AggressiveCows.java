package binarySearch;
import java.util.*;

public class AggressiveCows {
	 public static boolean isPossible(ArrayList<Integer> stalls, int k, int mid){
	        int CowCount = 1;
	        int lastposition = stalls.get(0);
	        //Only we just check the maximum difference for the position of Cows
	        for(int i : stalls){
	            if(i - lastposition >= mid){
	                CowCount++;
	                if(CowCount == k){
	                    return true;
	                }
	                lastposition = i;
	            }
	        }      
	        return false;        
	    }
	    
	    public static int aggressiveCows(ArrayList<Integer> stalls, int k) 
	    {
	        int start = 0;
	        int max = -1;
	        for(int i : stalls){
	            max = Math.max(i,max);
	        }
	        int end = max;
	        int ans = 0;
	        Collections.sort(stalls);
			int mid = start + (end - start)/2;
	        while(start <= end){
	            if(isPossible(stalls,k,mid)){
	                ans = mid;
	                start = mid + 1;
	            }else{
	                end = mid - 1;
	            }
	            mid = start + (end - start)/2;
	        }
	        return ans;       
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> stalls = new ArrayList<>();
		
		stalls.add(4);
		stalls.add(2);
		stalls.add(1);
		stalls.add(3);
		stalls.add(6);
		System.out.println(aggressiveCows(stalls,2));
	}

}
