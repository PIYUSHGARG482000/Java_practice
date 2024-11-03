package dsaOneCourse;
import java.util.*;
public class FindDuplicates {

	public static void main(String[] args) {
		int a[] = {1, 2, 2, 1, 3, 1, 1, 3};
		int k = 4;
		List<Integer> distinct = countDistinct(a,k);
		for(int x : distinct) {
			System.out.print(x + " ");
		}
	}
	
	
	public static List<Integer> countDistinct(int a[], int k){
		
		List<Integer> distinct = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		//this for loop Inserts the First K elements in the map
		for(int i=0; i<k; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		distinct.add(map.size());
		for(int i=k; i<a.length; i++) {
			if(map.get(a[i-k]) == 1) {
				map.remove(a[i-k]);
			}else {
				map.put(a[i-k], map.get(a[i-k])-1);
			}
		distinct.add(map.size());
		}
		
		return distinct;
	} 
	

}
