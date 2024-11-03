package strings;
import java.util.*;
public class GroupOfAnagrams {

	public static List<List<Integer>> grpAnagram(String[] str){
		Map<String, List<Integer>> map = new HashMap<>();
		
		
		for(int i=0; i<str.length; i++) {
			char[] charArray = str[i].toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<Integer>());
			}
			map.get(sorted).add(i+1);
		}
		return new ArrayList<>(map.values());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"act","cat","racecar","god","dog"};
		System.out.println(grpAnagram(a));
	}

}
