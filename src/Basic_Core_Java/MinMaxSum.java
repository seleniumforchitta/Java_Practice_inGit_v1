package Basic_Core_Java;

import java.util.Arrays;

public class MinMaxSum {

	public static void main(String[] args) {
		/*
		 * Input: a[] = {13, 5, 11, 9, 7}
			Output: 32 40
			Explanation: Minimum sum is 5 + 7 + 9 + 11 = 32 and 
			maximum sum is 7 + 9 + 11 + 13 = 40.
		 */
		
		int a[]= {13,5,11,9,7};
		int temp = 0;
		int max = 0;
		int min = 0;
		
		// To convert array to a string 
		String s = Arrays.toString(a);
		System.out.println(s);
		
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i]<a[i+1])
			{
				temp = a[i];
				a[i]=a[i+1];
				a[i+1] = temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			if(i!=a.length-1)
			{
				max = max+a[i];
			}
			if(i!=0)
			{
				min = min+a[i];
			}
			
		}
		
		System.out.println(max+" "+min);
		
		
	}

}
