package Most_Important_Java_Programs;

public class Sum_of_Array_Elements {

	public static void main(String[] args) {


		int arr[]= {3,4,6,7,9};
		String even="";
		String odd="";
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even=even+" "+arr[i];
			}
			else
			{
				odd=odd+" "+arr[i];
			}
		}
		
		System.out.println("Even Numbers -"+even);
	
		System.out.println("Odd Numbers -"+odd);
	}
}
