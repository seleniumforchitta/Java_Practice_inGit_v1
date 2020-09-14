package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TransverseAnArrayList {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Chitta","Biswa","Krushna");

		System.out.println(list);

		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (String a : list) {
			
			System.out.println(a);
		}
		
		
		

		
	}

}
