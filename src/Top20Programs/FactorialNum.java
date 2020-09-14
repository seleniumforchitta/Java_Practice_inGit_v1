package Top20Programs;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		//5 4 3 2 1 
		
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		double fact=1;
		for(int i=num;i>=1;i--)
		{
			fact = fact * i;		
		}	
		System.out.println(fact);
	}
}
