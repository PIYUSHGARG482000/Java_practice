package dataStructuresOOPS.trees;
import java.util.*;
public class views {
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data= data;
			left = right = null; 
		}
	}
	class pair{
		int hd;
		Node node;
		
		public pair(int hd, Node node) {
			this.hd = hd;
			this.node = node;
		}
	}
	//Top View of a Binary Tree
	public ArrayList<Integer> topView(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		//Tree Map is used to make the order of Nodes sorted
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<pair> q = new ArrayDeque<>();
		q.add(new pair(0, root));
		
		while(!q.isEmpty()) {
			pair curr = q.poll();
			map.putIfAbsent(curr.hd, curr.node.data);
			
			if(curr.node.left != null) {
				q.add(new pair(curr.hd-1, curr.node.left));
			}
			if(curr.node.right != null) {
				q.add(new pair(curr.hd+1, curr.node.right));
			}
		}
		for(Map.Entry<Integer, Integer> E : map.entrySet()) {
			list.add(E.getValue());
		}
		return list;
	}
	//Bottom View of a Binary Tree
	public ArrayList<Integer> bottomView(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		//Tree Map is used to make the order of Nodes sorted
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<pair> q = new ArrayDeque<>();
		q.add(new pair(0, root));
		
		while(!q.isEmpty()) {
			pair curr = q.poll();
			map.put(curr.hd, curr.node.data);
			
			if(curr.node.left != null) {
				q.add(new pair(curr.hd-1, curr.node.left));
			}
			if(curr.node.right != null) {
				q.add(new pair(curr.hd+1, curr.node.right));
			}
		}
		for(Map.Entry<Integer, Integer> E : map.entrySet()) {
			list.add(E.getValue());
		}
		return list;
	}
	//Left View of a Binary Tree
	public ArrayList<Integer> leftView(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node curr;
		while(!q.isEmpty()) {
			int size = q.size(); //To determine number of nodes in current level
			int i = 0;
			while(i++ < size){
				curr = q.poll();
				if(i == 1) {  // The very first node of Current Level
					list.add(curr.data);
				}
				
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		return list;
	}
	//Right View of a Binary tree
	public ArrayList<Integer> rightView(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node curr;
		while(!q.isEmpty()) {
			int size = q.size();//To determine the number of nodes in a Current level
			int i = 0;
			while(i++ < size) {
				curr = q.poll();
				if(i == size) {  //The very last Node of a Current Level
					list.add(curr.data);
				}
				
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		return list;
	}
}
