package Collection_Practice;

import java.util.*;

public class ArrayDequeExample {
	public static void main(String[] args) {
//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
//Traversing elements  
		for (String str : deque) {
			System.out.println(str);
		}
		
		deque.pollFirst();
		deque.pollLast();

		Iterator<String> it = deque.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
