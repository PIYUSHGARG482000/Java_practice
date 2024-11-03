package dataStructuresOOPS.trees;
import java.util.*;

public class Traversals {
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
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
	
	// NLR
	public void PreOrder(Node root) {
		
		if(root == null) return;
		
		if(root != null) {
			System.out.print(root.data + " ");
		}
		
		PreOrder(root.left);
		PreOrder(root.right);
	}
	//LNR
	public void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		
		if(root != null) {
			System.out.print(root.data + " ");
		}
		
		inOrder(root.right);
	} 
	//LRN
	public void postOrder(Node root) {
		if(root == null) return;
		
		if(root != null) {
			System.out.print(root.data + " ");
		}
		
		postOrder(root.left);
		postOrder(root.right);
	}
	//Level Order
	public void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr == null) {
				if(q.isEmpty()) return;
				else {
					System.out.println();
					q.add(null);
					continue;
				}
			}
			System.out.print(curr.data + " ");
			
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
	}
	//Reverse Level Order
	public void reverseLevelOrder(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr == null) {
				if(q.isEmpty()) return;
				else {
					System.out.println();
					q.add(null);
					continue;
				}
			}
			list.add(curr.data);
			
			if(curr.right != null) {
				q.add(curr.right);
			}
			if(curr.left != null) {
				q.add(curr.left);
			}
		}
		Collections.reverse(list);
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
	//Vertical Traversal
	public ArrayList<Integer> verticaltraversal(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		Queue<pair> q = new LinkedList<>();
		//TreeMap is used to place the Nodes in a Sorted Order
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		q.add(new pair(0, root));
		
		while(!q.isEmpty()) {
			pair curr = q.poll();
			if(map.containsKey(curr.hd)) {
				map.get(curr.hd).add(curr.node.data);
			}
			else {
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(curr.node.data);
				map.put(curr.hd, temp);
			}
			if(curr.node.left != null) {
				q.add(new pair(curr.hd-1, curr.node.left));
			}
			
			if(curr.node.right != null) {
				q.add(new pair(curr.hd+1, curr.node.right));
			}
		}
		for(Map.Entry<Integer, ArrayList<Integer>> E : map.entrySet()) {
			list.addAll(E.getValue());
		}
		return list;
	}
	//Zigzag Traversal/Spiral Traversal
	public ArrayList<Integer> zigzag(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		Deque<Node> q = new ArrayDeque<>();
		q.addFirst(root);
		boolean leftToRight = true;
		while(!q.isEmpty()) {
			int nodeCount = q.size();
			if(leftToRight) {
				while(nodeCount > 0) {
					Node curr = q.pollFirst();
					list.add(curr.data);
					
					if(curr.left != null) {
						q.addLast(curr.left);
					}
					if(curr.right != null) {
						q.addLast(curr.right);
					}
					nodeCount--;
				}
			}else {
				while(nodeCount > 0) {
					Node curr = q.pollLast();
					list.add(curr.data);
					
					if(curr.right != null) {
						q.addFirst(curr.right);
					}
					if(curr.left != null) {
						q.addFirst(curr.left);
					}
					nodeCount--;
				}
			}
			leftToRight = !leftToRight;
		}
		return list;
	}
	//Diagonal Traversal
	public ArrayList<Integer> diagonal(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			
			while(temp != null) {
				if(temp.left != null) q.add(temp.left);
				list.add(temp.data);
				temp = temp.right;
			}
		}
		return list;
	}
	//Boundary Traversal
	public ArrayList<Integer> boundary(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		//Left Subtree Boundary Nodes 
		LeftNodes(root.left, list);
		
		//Leaf Nodes of Left Subtree
		LeafNodes(root.left, list);
		
		//Leaf Nodes of Right SubTree
		LeafNodes(root.right, list);
		
		//Right Subtree Boundary Nodes
		RightNodes(root.right, list);
				
		return list;
	}
	public void LeftNodes(Node root, ArrayList<Integer> list) {
		if(root == null || (root.left == null && root.right == null)) {
			return;
		}
		list.add(root.data);
		if(root.left != null) {
			LeftNodes(root.left, list);
		}else {
			LeftNodes(root.right, list);
		}
	}
	public void LeafNodes(Node root, ArrayList<Integer> list) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			list.add(root.data);
		}
		LeafNodes(root.left, list);
		LeafNodes(root.right, list);
	}
	public void RightNodes(Node root, ArrayList<Integer> list) {
		if(root == null || (root.left == null && root.right == null)) {
			return;
		}
		if(root.right != null) {
			RightNodes(root.right, list);
		}else {
			RightNodes(root.left, list);
		}
		list.add(root.data);
	}
	//Morris Traversal (Inorder Traversal without Recursion & stack or Queue
	public ArrayList<Integer> Morris(Node root){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) return list;
		
		Node curr = root;
		while(curr != null) {
			if(curr.left == null) {
				list.add(curr.data);
				curr = curr.right;
			}else {
				Node pred = curr.left;   //Pred -> Predecessor which is currents left of right untill Null
				while(pred.right != null && pred.right != curr) {
					pred = pred.right;
				}
				//Creating Temporary Link to the curr node
				if(pred.right == null) {
					pred.right = curr;
					curr = curr.left;
				}
				//Removing Temporary Link from Curr node
				else {
					pred.right = null;
					list.add(curr.data);
					curr = curr.right;
				}
			}
		}
		return list;
	}
}
