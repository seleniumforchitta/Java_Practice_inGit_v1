package Top20Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		System.out.println("Print all the prime number inside "+limit);
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<limit;i++) {
			int count = 0;
			for(int j=1;j<i;j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count==1) {
				arr.add(i);
			}
		
		}
	System.out.println(arr);	
	}

}
