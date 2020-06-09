package Most_Important_Java_Programs;

import java.util.Scanner;

public class Reverse_A_Number {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number !");
		int num = sc.nextInt();
		int num1 = num;
		
		//Logic:1 - Using Algorithm
		int rev=0;
		while(num!=0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("Reverse number is : "+rev);
		
		//Logic:2 - Using StringBuffer class method
		StringBuffer rev1;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		rev1=sb.reverse();
		System.out.println("Reverse number is : "+rev1);
		
		//Logic:3 - Using StringBuilder class method
		StringBuilder rev2;
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num1);
		rev2 = sb1.reverse();
		System.out.println("Reverse number is : "+rev2);
		
		
		

	}

}
