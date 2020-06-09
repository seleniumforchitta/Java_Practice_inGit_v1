package Most_Important_Java_Programs;

public class Count_Even_Odd {

	public static void main(String[] args)
	{
		int num = 222;
		int even_count = 0;
		int odd_count=0;
		
		while(num>0)
		{
			int temp = num%10;
			num = num/10;
			if((temp%2)==0)
				even_count++;
			else
				odd_count++;
		}
		
		System.out.println("Total Even count - "+even_count+"\nTotal Odd count - "+odd_count);
	}
}
