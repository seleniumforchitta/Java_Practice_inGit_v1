package Top20Programs;

import java.util.HashMap;
import java.util.Map;

public class SearchAcharInString {

	public static void main(String[] args) {
		String str = "Chittarannnjan";
		char mychar = 'n';
		int count=0;
		Map<Object, Object> m = new HashMap<Object, Object>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==mychar) {
				count++;
				m.put(i, str.charAt(i));
			}
		}
		System.out.println(mychar+" is present 2 times in the String.");
		System.out.println(m);

	}

}
