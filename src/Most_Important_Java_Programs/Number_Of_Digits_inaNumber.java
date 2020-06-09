package Most_Important_Java_Programs;

public class Number_Of_Digits_inaNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		int num1=num;
		int count = 0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}

	System.out.println("Count of digits in "+num1+" is - "+count );
	}

}
