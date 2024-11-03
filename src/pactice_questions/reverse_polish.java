package pactice_questions;

import java.util.Stack;

public class reverse_polish {

	public static int solve_polish(String polish[])
	{
		Stack<String> st = new Stack<>();
		String oper = "+-/*";
		for(String i : polish) {
			if(!oper.contains(i)) {
				st.push(i);
			}else {
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				
				switch(i)
				{
				case "+" : 
					st.push(Integer.toString(a+b));
					break;
				case "-" : 
					st.push(Integer.toString(a-b));
					break;
				case "*" : 
					st.push(Integer.toString(a*b));
					break;
				case "/" : 
					st.push(Integer.toString(b/a));
					break;
				}			
			}
		}
		
		return Integer.valueOf(st.peek());
		
	}
	
	public static int solve_polish_optmz(String polish[]) {
		Stack<String> st = new Stack<>();
		
		String oper = "+-/*";
		
		for(String i : polish) {
			if(!oper.contains(i)) {
				st.push(i);
			}else {
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				int index = oper.indexOf(i);
				
				switch(index) {
					case 0 : 
						st.push(Integer.toString(a+b));
						break;
					case 1 : 
						st.push(Integer.toString(a-b));
						break;
					case 2 : 
						st.push(Integer.toString(b/a));
						break;
					case 3 : 
						st.push(Integer.toString(a*b));
						break;
				
				}
			}
		}
		return Integer.valueOf(st.pop());
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String polish[] = {"2", "1", "+", "3","*", "7", "2", "/" , "8", "+"};
		
		System.out.println(solve_polish_optmz(polish));
	}

}
