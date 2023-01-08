package Top20Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfCharInString {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Provide a string : "); //Chittaranjan
		String str = obj.nextLine();
		Map<Object, Object> m= new HashMap<Object, Object>();

		for(int i=0;i<str.length();i++)
		{
			int count = 0;
			for(int j=0; j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			System.out.println(str.charAt(i)+":"+count); //With Duplicates
			if(!m.containsKey(str.charAt(i))) 
			m.put(str.charAt(i), count);
		}
		System.out.println(m); // With No duplicate 
	}
}
