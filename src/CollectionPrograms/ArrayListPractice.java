package CollectionPrograms;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {

		List a = new ArrayList();
		ArrayList b = new ArrayList();
		
		a.add("Bapu");
		a.add("Bapi");
		a.add(null);
		a.addAll(Arrays.asList("Chitta","Biswa","Krushna","Sagar"));
		
		
		System.out.println(a);
		b=(ArrayList) a;
		System.out.println(b);
		
		a.remove(1);
		a.remove("Biswa");
		a.add(2, "Chitta_2");
		
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (Object object : a) {
			System.out.println(object);
		}
	
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
	}

}
