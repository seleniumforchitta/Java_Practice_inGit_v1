package Most_Important_Java_Programs;

import java.util.Arrays;

public class Arrays_are_Equal_or_Not {

	public static void main(String[] args) {


		int arr1[]= {3,4,6,7,9};
		int arr2[]= {3,4,6,7,9,1};
		
		
		//Approach 1
		boolean status = Arrays.equals(arr1, arr2);
		
		if(status)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	
		//Approach 2
		@SuppressWarnings("unused")
		boolean status1 = true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[2])
					status1=false;
			}
		}
		else status1=false;
		
		if(status)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

	}

}
