package recursion;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		
//		System.out.println(sum(5));
//		System.out.println(Power(2,5));

	System.out.println(findPath(4,2));
	
	}
	
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n + sum(n-1);
	}
	
	public static int Power(int a , int b) {
		if(b == 0) {
			return 1;
		}
		return a * Power(a, b-1);
	}
	//FATS POWER
	public static int fastpower(int a , int b){
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0) {
			return fastpower(a*a,b/2);
		}
		return fastpower(a,b-1);
	}
	//FIN DING PATHS
	public static int findPath(int row , int column) {
		if(row ==1 || column == 1) return 1;
		
		return findPath(row,column-1) + findPath(row-1,column);
	}
	

}
