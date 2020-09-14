package Top20Programs;

import java.util.Arrays;
import java.util.Scanner;

public class JumbledWordAddition {

	public static void main(String[] args) {
		
		//String s = "Bi123ch123nn";
		//0123+4567+09
		//1024123456
		//Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		String str = "qwerty1qwerty2";      
		//s = s.replaceAll("[^0-9]+", " ");
		//System.out.println(s);
		
		String s = "Bi123ch123nn";
		String s1 = s.replaceAll("[^0-9]", ",");
		String[] num = s1.split(",");	
		Integer temp = 0;
		for (int i=0;i<num.length;i++) {
			
			if(!num[i].isEmpty())
			{
				temp = temp+Integer.valueOf(num[i]);
			}
			//temp = temp+Integer.valueOf(num[i]);

		}
		System.out.println(temp);
	}

}
