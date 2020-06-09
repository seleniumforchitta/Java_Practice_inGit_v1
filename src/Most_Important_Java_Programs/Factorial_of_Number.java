package Most_Important_Java_Programs;

public class Factorial_of_Number {

	public static void main(String[] args) {
		
		int num = 10;
		int fact = 1;
		
		for(int i = 1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
