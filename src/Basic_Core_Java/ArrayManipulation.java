package Basic_Core_Java;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {13,5,23,4,7,8};
		int temp =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
			
			
		}
		int s = a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println(a[i]+"+"+a[s-i]+" = "+(a[i]+a[s-i]));
			//System.out.println(a[s-i]);
			//
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
