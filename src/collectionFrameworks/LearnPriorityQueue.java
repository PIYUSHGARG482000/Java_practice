package collectionFrameworks;
import java.util.*;
public class LearnPriorityQueue {

	public static void main(String[] args) {
		
		Queue<Integer> pque = new PriorityQueue<>(Comparator.reverseOrder());
		
		pque.offer(40);
		pque.offer(12);
		pque.offer(24);
		pque.offer(36);
		
		System.out.println(pque);// IT EXECUTE MINHEAP
		
		pque.poll();
		System.out.println(pque);
		
		System.out.println(pque.peek());

	}

}
