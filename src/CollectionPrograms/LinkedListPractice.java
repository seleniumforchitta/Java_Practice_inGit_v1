package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
		
	
		List a = new LinkedList();
		LinkedList b = new LinkedList();
		ArrayList c = new ArrayList();
		
		a.add("Bapu");
		a.add(1, "Bapi");
		a.addAll(Arrays.asList("Chitta","Biswa","Krushna","Sagar"));
		
		b=(LinkedList) a;
		c=(ArrayList) a;
		
		System.out.println(a+","+b+c);
		
		
		

	}

}
