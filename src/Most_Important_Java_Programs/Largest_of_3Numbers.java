package Most_Important_Java_Programs;

public class Largest_of_3Numbers {

	public static void main(String[] args) {
	
		int a = 10,b = 20,c = 30;
	
	//Approach 1 - If Else
		if (a>b && a>c)
			System.out.println("a is the largest number");
		else if (b>a && b>c)
			System.out.println("b is the largest number");
		else if (c>a && c>b)
			System.out.println("c is the largest number");
		else System.out.println("2 or More largest number are there");
		
	//Approach 2 - Ternary Operator
		int largest = a>b?a:b;
		largest = c>largest?c:largest;
		System.out.println(largest+" is the largest Number");
	}
}
