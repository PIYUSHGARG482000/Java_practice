package dataStructuresOOPS.trees;
import java.util.*;
public class Tree {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Node root = createTree();	
		System.out.println("Inorder Traversal: ");
		inOrder(root);
		System.out.println("Preorder Traversal: ");
		preOrder(root);
		System.out.println("Postorder Traversal: ");
		postOrder(root);
		
	}
	static Node createTree() {
		Node root = null;
		System.out.println("Enter Data: ");
		int data = sc.nextInt();
		//Base Case for Recursion
		if(data == -1) return null;
		
		root = new Node(data);
		System.out.println("Enter Left Child for " + data + " : ");
		root.left = createTree();
		
		System.out.println("Enter Right Child for " + data + " : ");
		root.right = createTree();
		
		return root;
	}
	
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		
	}
	static void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);		
		preOrder(root.right);
		
	}
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");		
	}
	
}
class Node{
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}	
}