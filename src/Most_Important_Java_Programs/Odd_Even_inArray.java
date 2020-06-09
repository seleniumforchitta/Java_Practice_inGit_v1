package Most_Important_Java_Programs;

public class Odd_Even_inArray {

	public static void main(String[] args) {


		int arr[]= {3,4,3,3,3};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		
		System.out.println(sum);
		sum=0;
		for(int value:arr)
		{
			sum=sum+value;
		}
		System.out.println(sum);
	}
}
