package questions;
import java.util.*;
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int valid_row(int row, int[][] grid) {
		int temp[] = grid[row];
		Set<Integer> set = new HashSet<>();
		
		//0 considered as an empty Cell
		//Checking value from range 0 to 9
		for(int value: temp) {
			if(value < 0 || value > 9) {
				System.out.println("Invalid Value");
				return -1;
			}
			else if(value != 0) {
				if(set.add(value) == false) {
					return 0;     //0 represents its a Repeative value
				}
			}
		}
		return 1;
	}
	public static int valid_column(int cols, int[][] grid) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<9; i++) {
			//Check for value outside the range 0 to 9
			int value = grid[i][cols];
			if(value < 0 || value > 9) {
				System.out.println("Invalid value");
				return -1;
			}
			else if(value != 0) {
				if(set.add(value) == false) {
					return 0;
				}
			}
		}
		return 1;
	}
	// 1 1 1  2 2 2  3 3 3
	// 4 4 4  5 5 5  6 6 6
	// 7 7 7  8 8 8  9 9 9
	
	// 1 1 1  2 2 2  3 3 3
	// 4 4 4  5 5 5  6 6 6
	// 7 7 7  8 8 8  9 9 9
	
	// 1 1 1  2 2 2  3 3 3
	// 4 4 4  5 5 5  6 6 6
	// 7 7 7  8 8 8  9 9 9
		
	public static int valid_subsequence(int[][] grid) {
		Set<Integer> set = new HashSet<>();
		for(int rows=0;rows<9;rows++) {
			for(int cols=0; cols<9; cols++) {
				for(int r=0; r<rows+3; r++) {
					for(int c=0; c<cols+3; c++) {
						if(grid[r][c] < 0 || grid[r][c] > 9) {
							System.out.println("Invalid Value");
							return -1;
						}else if(grid[r][c] != 0) {
							if(set.add(grid[r][c]) == false) {
								return 0;
							}
						}
					}
					
				}
			}
		}
		return 1;
	}
	public static void valid_board(int[][] grid) {
		for(int i=0; i<9; i++) {
			int res1 = valid_row(i,grid);
			int res2 = valid_column(i,grid);
			
			if(res1 < 1 || res2 < 1) {
				System.out.println("Board is Invalid");
				return;
			}
			int res3 = valid_subsequence(grid);
			if(res3 < 1) {
				System.out.println("Board is Invalid");
				return;
			}
		}
		System.out.println("Board is Valid");
	}
}
