package Top20Programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {

	public static void main(String[] args) {
		
		//int[] arr = {8,1,23,5,4,3,8,2,4,3,1,23,8,8,8,8,8,9};
		
		String arr = "This is a beutiful day";
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<arr.length();i++)
		{
			int count=1;
			if(map.containsKey(arr.charAt(i)))
			{
				count=map.get(arr.charAt(i))+1;
			}
			
			map.put(arr.charAt(i), count);
		
		}	
		System.out.print(map);
	}
}


