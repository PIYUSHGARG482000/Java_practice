package dataStructuresOOPS.graphs;
import java.util.*;
public class graph {
	//implementation of Graph
//	private static LinkedList<Integer> adj[];
	
	private static ArrayList<ArrayList<Integer>> adj;
	public graph(int v) {
		adj = new ArrayList<>();
	    for(int i=0; i<v; i++) {
	    	adj.add(new ArrayList<Integer>());
	    }
	}
	
	public void addEdge(int src, int dest) {
		adj.get(src).add(dest);
		adj.get(dest).add(src);
	}
	
	//Minimum distance from source to Destination path
	private static int bfs(int src, int dest) {
		boolean visited[] = new boolean[adj.size()];
		int parent[] = new int[adj.size()];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		parent[src] = -1;
		visited[src] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			if(curr == dest) break;
			
			for(int neighbour : adj.get(curr)) {
				if(!visited[neighbour]) {
					q.add(neighbour);
					visited[neighbour] = true;
					parent[neighbour] = curr;
				}
			}
		}
		int curr = dest;
		int distance = 0;
		while(parent[curr] != -1) {
			System.out.print(curr + " ");
			curr = parent[curr];
			distance++;
		}
		return distance;		
	}	
	
	private static boolean dfsUtil(int src, int dest, boolean visited[]) {
		//Base case
		if(src == dest) return true;
		
		
		for(int neighbour : adj.get(src))
		{
			if(!visited[neighbour]) {
				visited[neighbour] = true;
				boolean isConnected = dfsUtil(neighbour, dest, visited);
				if(isConnected) return true;
			}
		}
		return false;
	}
	
	private static boolean dfsStack(int src, int dest, boolean visited[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(src);
		
		while(!stack.isEmpty()) {
			int curr = stack.pop();
			if(curr == dest) return true;
			
			for(int neighbour : adj.get(curr)) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					stack.add(neighbour);
				}
			}
		}
		return false;
	}
	
	
	
	public static boolean dfs(int src, int dest) {
		boolean visited[] = new boolean[adj.size()];
		visited[src] = true;
		return dfsUtil(src, dest, visited);
//		return dfsStack(src, dest, visited);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Edges and Vertex for Graph");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		graph g = new graph(v);
		
		System.out.println("Now Enter the Connected Components of a undirected Graph");
		for(int i=0; i<e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}
		
		System.out.println("Enter Source and Destination for Shorter Path");
		int src = sc.nextInt();
		int dest = sc.nextInt();
		
		System.out.println("Shortest Distance " + src + " to " + dest + " is " + bfs(src, dest));
	
		System.out.println("Path possible : " + dfs(src, dest));
		sc.close();
	}

}
