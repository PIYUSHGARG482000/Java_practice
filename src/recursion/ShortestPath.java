package recursion;

public class ShortestPath {

	public static void main(String[] args) {
		
		int a[][] = {
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
				{0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
				{1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
				{0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
		};
		
		int result = shortestPath(a, 0, 0, 0, 9);
		
		if(result > 1000000) {
			System.out.println("No Path is Possible.");
		}else {
			System.out.println(result);
		}
	}
	
	static int shortestPath(int a[][], int i, int j, int x, int y) {
		int rows = a.length;
		int cols = a[0].length;
		
		boolean Vis[][] = new boolean[rows][cols];
		
		return shortestPath(a, i, j, x, y, Vis);
		
	}
	
	static boolean isValid(int a[][], int i, int j, boolean Vis[][]) {
		int rows = a.length;
		int cols = a[0].length;
		
		//Conditions to check whether the path is valid to Traverse or not. 
		return i >=0 && j >=0 && i < rows && j < cols && a[i][j] == 1 && 
				!Vis[i][j];
	}
	
	
	static int shortestPath(int a[][], int i, int j, int x, int y, boolean Vis[][]) {
			
		
		if(!isValid(a, i, j, Vis)) return 1000000;
		if(i == x && j == y) return 0;
		
		Vis[i][j] = true;
		int left = shortestPath(a, i, j-1, x, y, Vis) + 1;
		int right = shortestPath(a, i, j+1, x,y, Vis) + 1;
		int top = shortestPath(a, i-1, j, x, y, Vis) + 1;
		int bottom = shortestPath(a, i+1, j, x, y, Vis) + 1;
		
		//Backtracking used so that the Other Traversel occures to find shortest path
		Vis[i][j] = false;
		
		return Math.min(Math.min(left, top), Math.min(right, bottom));
		
	}

}
