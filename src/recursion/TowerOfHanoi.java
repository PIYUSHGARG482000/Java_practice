package recursion;

public class TowerOfHanoi {

	
	public static void towerofhanoi(int n, String src, String helper, String dest) {
		
		//if Tower contains only one disk then it directly transfer to Destination
		if(n == 1) {
			System.out.println("Transfer disk "+ n + " from " + src + " to " + dest);
			return;
		}		
		//Transfer n-1 disk from source to Helper
		towerofhanoi(n-1,src,dest,helper);
		//Transfer 1 left disk on source to destination via Print
		System.out.println("Transfer disk "+ n + " from " + src + " to " + dest);
		//Transfer helper n-1 disk to destination by source as a helper
		towerofhanoi(n-1,helper,src,dest);		
	}
	
	public static void printString(String str, int index) {
		
		if(index < 0) {
			return;
		}
		System.out.print(str.charAt(index));
		printString(str,index-1);		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
//		towerofhanoi(n,"S","H","D");
		String str = "PiyushGarg";
		printString(str,str.length()-1);
	}

}
