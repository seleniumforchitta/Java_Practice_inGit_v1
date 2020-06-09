package Collection_Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {


		//Creating ArrayList Class Object
		LinkedList<String> list = new LinkedList<String>(); 
		list.add("Chiku");
		list.add("chitta");
		list.add("Ambuja");
		list.add("Ambuja");
		list.add(2, "Swain");
		list.addAll(list);
		list.add(String.valueOf(2));
		
		System.out.println(list);
		
	
		//Traversing the list through iterator 
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
