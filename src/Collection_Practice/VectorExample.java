package Collection_Practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {


		//Creating ArrayList Class Object
		Vector<String> list = new Vector<String>(); 
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
		
		//Traversing the list through Enumeration
		Enumeration<String> itr;
		itr = list.elements();
		while(itr.hasMoreElements())
		{
			System.out.println(itr.nextElement());
		}

	}

}
