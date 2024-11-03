package dataStructuresOOPS.queue;

public class QueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListQueue q = new LinkedListQueue();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
//		System.out.println("\n\n\n");
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.dequeue();
		}
	}

}

class Myqueue{
	int size;
	int arr[];
	int rear = -1;
	
	//Constructor
	public Myqueue(int n) {
		arr = new int[n];
		this.size = n;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return rear == -1;
	}
	
	//Enqueue
	public void enque(int data) {
		
		if(rear == size-1) {
			System.out.println("Queue is completely filled.");
			return;
		}
		rear++;
		arr[rear] = data;
	}
	//dequeue
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is already Empty.");
			return -1;
		}
		int removed = arr[0];
		for(int i=0; i<rear; i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		return removed;
	}
	//Peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is already Empty.");
			return -1;
		}
		return arr[0];
	}
}

class circularArrayque{
	int size;
	int arr[];
	int front = -1;
	int rear = -1;
	
	public circularArrayque(int n) {
		arr = new int[n];
		this.size = n;
	}
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	public boolean isFull() {
		return (rear+1)%size == front;
	}
	
	public void enque(int data) {
		if(isFull()) {
			System.out.println("Queue is already filled completely.");
			return;
		}
		//if first element are there
		if(front == -1) front = 0;
		rear = (rear+1)%size;
		arr[rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is already Empty.");
			return -1;
		}
		
		int removed = arr[front];
		//Only One element is present in the Queue
		if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = (front+1)%size;
		}
		return removed;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is already Empty.");
			return -1;
		}
		
		return arr[front];
	}
}

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class LinkedListQueue{
	Node front = null;
	Node rear = null;
	
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	public void enque(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = rear = newNode;
		}
		rear.next = newNode;
		rear = newNode;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is already Empty.");
			return -1;
		}
		int removed = front.data;
		front = front.next;
		return removed;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is already Empty.");
			return -1;
		}
		return front != null ? front.data : -1;
	}
}