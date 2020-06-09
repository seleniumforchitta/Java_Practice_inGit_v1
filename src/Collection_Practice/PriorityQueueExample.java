package Collection_Practice;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueExample {

	public static void main(String[] args) {

		// Creating ArrayList Class Object
		PriorityQueue<String> list = new PriorityQueue<String>();
		list.add("Chittaranjan Swain");
		list.add("Ambuja Mohanty");
		list.add("Priyabrata Mohapatra");

		System.out.println("Head : " + list.element());
		System.out.println("Head : " + list.peek());

		// Traversing the list through iterator
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		list.remove();
		list.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
