package Top20Programs;

import java.util.Scanner;

public class JumbledWord {

	public static void main(String[] args) {
		
		String s = "Bi0123ch45678nn09";
		//1024123456
		//Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		
		String m = "";
		for (int i=0;i<s.length();i++) {
			
			int j = s.charAt(i);
			if(j>=48 && j<=57)
			{
				m=m+s.charAt(i);
			}

			
		}
		System.out.println(m);
	}

}
