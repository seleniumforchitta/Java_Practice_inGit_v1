package Most_Important_Java_Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		//16461, 13531
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String   - ");
		String str = sc.next();
		
		String org_str = str;
		String newstr = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			newstr=newstr+str.charAt(i);
		}
		
		if(newstr.equals(org_str))
			System.out.println(org_str+" is a Palindrome String");
		else 
			System.out.println(org_str+" is not a Palindrome String");	
	}
}
