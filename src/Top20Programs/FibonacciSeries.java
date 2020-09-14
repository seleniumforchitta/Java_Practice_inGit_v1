package Top20Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Find the fibo till - ");
		int num = obj.nextInt();
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<num;i++)
		{
			c = a+b;
			a = b;
			b = c;
			
			System.out.print(c+" ");	
		}
	}
}
