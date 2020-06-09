package Most_Important_Java_Programs;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Before Swaping a = "+a+" and b = "+b);
		//logic:1 - using 3rd variable 
		int t = a;
		a = b;
		b = t;
		System.out.println("After  Swaping a = "+a+" and b = "+b);
		//logic:2 - using addition & subtraction
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After  Swaping a = "+a+" and b = "+b);
		//logic:3 - using multiplication and Division
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("After  Swaping a = "+a+" and b = "+b);
		//logic:4 - using bitwise XOR operator
		a = a^b; // 10^20 = 30
		b = a^b; // 30^20 = 10
		a = a^b; // 30^10 = 20
		System.out.println("After  Swaping a = "+a+" and b = "+b);
		//logic:5 - using single statement
		b=a+b-(a=b);
		System.out.println("After  Swaping a = "+a+" and b = "+b);
		a=a+b-(b=a);
		System.out.println("After  Swaping a = "+a+" and b = "+b);
		
		
		
		

	}

}
