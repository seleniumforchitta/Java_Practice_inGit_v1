package Top20Programs;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int check=Math.abs(num);
		num = Math.abs(num);
		int temp=0;
		
		while(num>0) 
		{
			temp = (temp*10)+(num%10); 
			num = num/10;
		}
		System.out.println(temp);
		
		if(check == temp)
		{
			System.out.println("It is a Palindrome");
		}
		else System.out.println("It is not a palindrome");

	}

}
