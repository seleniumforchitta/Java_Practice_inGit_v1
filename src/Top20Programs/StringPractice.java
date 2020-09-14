package Top20Programs;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Provide a string : ");
		String str = obj.nextLine();
		
		int len = str.length();
		
		char temp;
		int count = 0;
		String str1 = null;
		
		for(int i=0;i<len;i++)
		{
			temp = str.charAt(i);
			for(int j=0; j<len; j++)
			{
				if(temp == str.charAt(j))
				{
					count++;
				}
			}
			
			str1 = str1+temp;
			if(str1.contains(String.valueOf(temp)))
			{
				System.out.println(temp+":"+count);	
			}
			else {
				
			}
			
			count = 0;
		}
	}
}
