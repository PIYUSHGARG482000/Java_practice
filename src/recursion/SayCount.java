package recursion;

public class SayCount {

	public static String[] map = {"Zero", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine"};
	
	
	public static void Saycount(int n) {
		if(n == 0) return;
		Saycount(n/10);
		System.out.print(map[n%10] + " ");		
	}
	
	public static void main(String[] args) {
		Saycount(421);
	}

}
