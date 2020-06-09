package Most_Important_Java_Programs;

import java.util.Scanner;

public class Number_is_Prime_orNOT {

	public static void main(String[] args) {
		
		//Prime Number - which has only 2 factors i.e. 1 & itself
		
		//2,3,5,7,11,13,17
		
		System.out.println("Please Enter a number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i == 0)
					count++;
			}
			if(count==2) 
				System.out.println("It is a prime number");
			
			else System.out.println("Not a Prime Number.");
		}
		else System.out.println("Not a Prime Number.");
	}

}
