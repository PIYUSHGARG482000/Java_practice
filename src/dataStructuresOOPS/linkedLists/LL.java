package dataStructuresOOPS.linkedLists;

public class LL {
	
	Node head;
	//Node class
	class Node{
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//add node to the first position of a LinkedList	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	public void printList() {
		if(head == null) {
			System.out.println("List is Currently Empty.");
		}
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " -> ");
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list = new LL();
		list.addFirst(8);
		list.addLast(10);
		list.addLast(120);
		list.printList();
	}

}
