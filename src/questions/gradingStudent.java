package questions;

import java.util.*;

public class gradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> grading = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n-1; i++) {
			grading.add(i, sc.nextInt());
		}
		gradingStudents(grading);

	}
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	    List<Integer> G = new ArrayList<>(grades.size());
	    for(int i=0; i<grades.size(); i++){
	        int nextM = (grades.get(i)/5)+1 * 5;
	        if(grades.get(i) < 38){
	            G.add(i,grades.get(i));
	        }if(grades.get(i)%5 == 0){
	            G.add(i,grades.get(i));
	        }if(nextM - grades.get(i) < 3){
	                G.add(i,nextM);
	        }else{
	          G.add(i,grades.get(i));
	        }
	    } 
	    return G;
	    }
}
