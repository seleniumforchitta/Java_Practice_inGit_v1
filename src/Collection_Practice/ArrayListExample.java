package Collection_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {


		//Creating ArrayList Class Object
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("Chiku");
		list.add("chitta");
		list.add("Ambuja");
		list.add("");
		list.add(2, "Swain");
		list.addAll(list);
		list.add(String.valueOf(2));
		//Traversing the list through iterator 
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(list);

	}

}
