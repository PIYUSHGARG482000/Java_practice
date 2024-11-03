package dataStructuresOOPS.heaps;
import java.util.*;
public class Heap {

	int a[];
	int size;
	
	public Heap() {
		this.a = new int[1000];
		this.size = 0;
	}
	
	public void swap(int x, int y) {
		a[x] = a[x] ^ a[y];
		a[y] = a[x] ^ a[y];
		a[x] = a[x] ^ a[y];
	}
	
	public void insert(int data) {
		this.size = size+1;
		a[size] = data;
		int index = size;
		
		while(index > 1) {
			int parent = index/2;
			if(a[parent] < a[index]) {
				swap(parent, index);
			}else {
				return;
			}
		}
	}
	
	
	public void delete() {
		
		if(size == 0) {
			System.out.println("Can't be deleted now.");
			return;
		}
		//Step 1: copy the last element of Tree to the Root Node
		a[1] = a[size];
		
		//Step 2:  decrease the size of a array
		size--;
		
		//Step 3:  Now place the last element to the correct position in the tree 
		int i = 1;
		while(i < size) {
			int leftchild = 2*i;
			int rightchild = 2*i+1;
			
			if(leftchild < size && a[leftchild] > a[i]) {
				swap(leftchild, i);
				i = leftchild;
			} 
			else if(rightchild < size && a[rightchild] > a[i]) {
				swap(rightchild, i);
				i = rightchild;
			}
			else {
				return;
			}
		}
	}
	
	public void print() {
		for(int i=1; i<=size; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		Heap h = new Heap();
		h.insert(60);
		h.insert(50);
		h.insert(40);
		h.insert(30);
		h.insert(5);
		h.insert(20);
		h.insert(10);
		h.insert(45);
		h.print();
		System.out.println();
		h.delete();
		h.delete();
		h.print();
	}

}
