package strings;

public class RemoveAllOccurances {
	
	public static String remove(String s, String part) {
		//It tells the the vary starting index of presence of the part String 
		int index = s.indexOf(part);
		System.out.println(s + " " + index);
		while(index != -1) {
			s = s.substring(0,index) + s.substring(index + part.length());
			index = s.indexOf(part);
			System.out.println(s + " " + index);
		}
		return s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remove("daabcbaabcbc","abc"));	
	}

}
