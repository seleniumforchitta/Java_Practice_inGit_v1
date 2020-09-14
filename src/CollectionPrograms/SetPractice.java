package CollectionPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		
		Set a = new HashSet();
		Set b = new LinkedHashSet();
		Set c = new TreeSet();
		
		
		a.add("Bapu");
		a.add("Bapi");
		a.add("Bapu");
		a.add(null);
		
		System.out.println(a);
		
		
		

	}

}
