package dataStructuresOOPS.vectorsAndStack;
//import java.util.*;
public class StackUsingLinkedList {
	
	//Push At Bottom function
	public static void pushAtBottom(int data,Stack s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data,s);
		s.push(top);
	}
	//Reverse the stack without using space
	public static void reverse(Stack s) {
		if(s.isEmpty()) return;
		int top = s.pop();
		reverse(s);
		pushAtBottom(top,s);
	}
	
	
	
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		pushAtBottom(5,s);
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
//		System.out.println(s.pop());
	} 
}
/*By using LinkedList we can dynamically allocate space 
 * as compared to ordinary array of fixed length*/
//Node class
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class Stack{
	public Node head;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return head.data;
	}
}