package Top20Programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.print("Find the prime numbers till - ");
		int num = obj.nextInt();
	
		
		for(int i=1;i<=num;i++)
		{
			int count = 0;
			for(int j = i;j>=1;j--)
			{
			
				if(i%j == 0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
					System.out.print(i+" ");
			}
				
			}		
		}
	}
