package Collection_Practice;

import java.util.*;

public class LinkedHashSetExample {
	public static void main(String args[]) {
//Creating HashSet and adding elements  
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("");
		set.add("Vijay");
		set.add("Ravi");
		set.add("");
		set.add("Ajay");
//Traversing elements  
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
