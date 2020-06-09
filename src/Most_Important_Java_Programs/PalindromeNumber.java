package Most_Important_Java_Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//16461, 13531
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number - ");
		int num = sc.nextInt();
		
		int org_num = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num=num/10;
		}
		
		if(rev==org_num)
			System.out.println(org_num+" is a Palindrome Number");
		else 
			System.out.println(org_num+" is not a Palindrome Number");	
	}
}
