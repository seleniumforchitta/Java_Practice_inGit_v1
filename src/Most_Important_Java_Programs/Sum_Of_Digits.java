package Most_Important_Java_Programs;

public class Sum_Of_Digits {

	public static void main(String[] args)
	{
		int num = 123;
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+(num%10);
			num = num/10;
		}
		
		System.out.println("Sum of all the digits - "+sum);
	}
}
