package Top20Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int[] arr = {8,1,23,5,4,3,8,2,4,3,1,23,8,8,8,8,8,9};
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(map.containsKey(arr[i]))
			{
				count=map.get(arr[i])+1;
			}
			
			map.put(arr[i], count);
		
		}	
		System.out.print(map);
	}
}


