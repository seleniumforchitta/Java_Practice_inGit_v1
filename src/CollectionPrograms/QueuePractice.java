package CollectionPrograms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
		Queue<String> q = new PriorityQueue<String>();
		Queue d = new ArrayDeque();
		
		q.addAll(Arrays.asList("Chitta","Biswa","Krushna"));
		q.add("Biswa1");
		q.add("Biswa2");
		q.add("Biswa3");
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);

		

	}

}
