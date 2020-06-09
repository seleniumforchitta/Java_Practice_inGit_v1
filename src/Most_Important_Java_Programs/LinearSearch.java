package Most_Important_Java_Programs;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[]= {3,4,6,3,9,4};
		int a = 3;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				System.out.println(a+" element is found in "+i+" position");
			}
		}
	}

}
