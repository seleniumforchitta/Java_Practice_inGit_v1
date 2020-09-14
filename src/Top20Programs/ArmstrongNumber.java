package Top20Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		Scanner np = new Scanner(System.in);
		int num = np.nextInt();
		int temp=0;
		while(num>0)
		{
			temp = (int) (temp+(Math.pow((num%10), 3)));
			num=num/10;
		}
		
		System.out.println(temp);

	}

}
