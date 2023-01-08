package Top20Programs;

import java.util.HashMap;
import java.util.Map;

public class SearchAnumInArr {

	public static void main(String[] args) {
		int[] arr = {33,56,76,45,2,7,9,67,56};
		int myNum = 56;
		int count = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(myNum == arr[i]) {
				count++;
				m.put(i, arr[i]);
			}
		}
		System.out.println(myNum+" is present 2 times in the array.");
		System.out.println(m);

	}

}
