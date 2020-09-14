package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TraverseAMap {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(1, "Chitta");
		map.put(2, "Biswa");
		map.put(3, "Krushna");
		map.put("s", "Jitu");

		System.out.println(map);
		Set set = map.keySet();
		for (Object s : set) {
			System.out.println(map.get(s));
		}
		

	}

}
