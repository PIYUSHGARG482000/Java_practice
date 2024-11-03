package strings;
import java.util.*;
public class PanagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		boolean alphalist[] = new boolean[26];
		int index = 0;
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				index = ch -'A';
			}if(ch >= 'a' && ch <= 'z'){
				index = ch - 'a';
			}	
			alphalist[index] = true;			
		}
		boolean isPanagram = false;
		for(boolean x: alphalist) {
			if(!x) {
				isPanagram = true;
				break;
			}
		}
		if(isPanagram) {
			System.out.println(S + " is a panagram String.");
		}else {
			System.out.println(S + " is not a panagram String.");
		}
				
	}

}
