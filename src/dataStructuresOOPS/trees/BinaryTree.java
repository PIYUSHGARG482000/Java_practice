package dataStructuresOOPS.trees;
import java.util.*;
public class BinaryTree {
	
	//Node class for the Tree
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data= data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinTree{
		static int idx = -1; 	//for creating root of a Binary Tree
		
		public Node buildTree(int nodes[]) {
			idx++;  //Creating root of a Binary tree
			
			//Base case for null Node
			if(nodes[idx] == -1) {
				return null;
			}
			
			//Traversing each node and creating the left and right nodes to build the binary tree
			Node element = new Node(nodes[idx]);
			element.left = buildTree(nodes);
			element.right = buildTree(nodes);
			
			return element;
		}
		
		public void PreOrder(Node root) {
			
			if(root == null) return;
			
			if(root != null) {
				System.out.print(root.data + " ");
			}
			
			PreOrder(root.left);
			PreOrder(root.right);
		}
		public void inOrder(Node root) {
			if(root == null) return;
			
			inOrder(root.left);
			
			if(root != null) {
				System.out.print(root.data + " ");
			}
			
			inOrder(root.right);
		} 
		public void postOrder(Node root) {
			if(root == null) return;
			
			if(root != null) {
				System.out.print(root.data + " ");
			}
			
			postOrder(root.left);
			postOrder(root.right);
		}
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
				System.out.print(curr.data+" ");				
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		public int countNodes(Node root) {
			if(root == null) return 0;
			return countNodes(root.left) + countNodes(root.right) + 1;
		}
		public int sumOfNodes(Node root) {
			if(root == null) return 0;
			return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
		}
		public int HeightofBST(Node root) {
			if(root == null) return 0;
			return Math.max(HeightofBST(root.left), HeightofBST(root.right))+1;
		}
		static int diameter = 0;
		public int calcDiameter(Node root) {
			if(root == null) return 0;
			
			int leftHeight = calcDiameter(root.left);
			int rightHeight = calcDiameter(root.right);
			
			diameter = Math.max(diameter, 1+leftHeight+rightHeight);
			return Math.max(leftHeight, rightHeight)+1;
		}
		
	}
	
	public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		
		BinTree b1 = new BinTree();
		Node root = b1.buildTree(nodes);
		
//		System.out.println(root.data);
		
		System.out.print("PreOrder Traversal: \t" );
		b1.PreOrder(root);
		
		System.out.println();
		System.out.print("InOrder Traversal: \t" );
		
		b1.inOrder(root);
		System.out.println();
		
		System.out.print("PostOrder Traversal: \t" );
		b1.postOrder(root);
		
		System.out.println();
		System.out.print("LevelOrder Traversal: \t\n");
		b1.levelOrder(root);
		
		System.out.println();
		System.out.print("Number of Nodes in a Tree : " + b1.countNodes(root));
		
		System.out.println();
		System.out.print("Sum of Nodes in a Tree : " + b1.sumOfNodes(root));
		
		System.out.println();
		System.out.print("Height of Binary Tree : " + b1.HeightofBST(root));
		
		System.out.println();
		b1.calcDiameter(root);
		System.out.println("Diameter of a Binary Tree: " + b1.diameter);
		
	}

}
