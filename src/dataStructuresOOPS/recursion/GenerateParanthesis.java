package dataStructuresOOPS.recursion;
import java.util.*;
public class GenerateParanthesis {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		paranthesis(3,0,0,list,"");
		for(String s : list) {
			System.out.print(s + " ");
		}
		
	}
	
	public static List<String>  paranthesis(int n, int l, int r, List<String> list, String s) {
		if(s.length() == 2*n) {
			list.add(s);
		}if(l < r) {
			paranthesis(n,l+1,r,list,s+'(');
		}if(r < l) {
			paranthesis(n,l,r+1,list,s+')');
		}
		return list;
	}

}
