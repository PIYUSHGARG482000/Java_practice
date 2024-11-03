package dataStructuresOOPS.recursion;
import java.util.*;
public class NqueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows: ");	
		int n = sc.nextInt();
		int queen[][] = new int[n][n];
		if(nQueen(queen,0,n)) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(queen[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
	static boolean nQueen(int[][] queen, int x, int n) {
		//Base Case that means all the N queen's are placed in the board
		if(x >= n) return true;
		//for checking individual column and row in a Board
		for(int cols=0; cols<n; cols++) {
			if(isSafe(queen,x,cols,n)) {
				queen[x][cols] = 1;
				
				if(nQueen(queen,x+1,n)) {
					return true;
				}
				queen[x][cols] = 0; //Backtracking for Updated result				
			}
		}
		return false;
	} 	
	static boolean isSafe(int[][] queen, int x, int y, int n) {
		for(int row=0; row<x; row++) {
			if(queen[row][y] == 1) {
				return false;
			}
		}
		int rows = x;
		int cols = y;
		//for checking left diagonals of Board
		while(rows >= 0 && cols >= 0) {
			if(queen[rows][cols] == 1) {
				return false;
			}
			rows--;
			cols--;
		}
		
		rows = x;
		cols = y;
		//for checking right diagonal of Board
		while(rows >= 0 && cols <n) {
			if(queen[rows][cols] == 1) {
				return false;
			}
			rows--;
			cols++;
		}
		return true;
	}
}
