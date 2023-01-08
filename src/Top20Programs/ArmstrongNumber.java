package Top20Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		Scanner np = new Scanner(System.in);
		int num = np.nextInt();
		String numstr = Integer.toString(num);
		int len = numstr.length();
		int temp=0;
		while(num>0)
		{
			temp = (int) (temp+(Math.pow((num%10), len)));
			num=num/10;
		}
		
		System.out.println(temp);
		if(Integer.parseInt(numstr)==temp)
			System.out.println(numstr+" is an Armstrong Number");
		else System.out.println(numstr+" is not an Armstrong Number");

	}

}
