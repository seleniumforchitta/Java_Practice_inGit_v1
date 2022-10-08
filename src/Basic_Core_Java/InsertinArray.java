package Basic_Core_Java;

import java.util.Arrays;

public class InsertinArray {

	public static void main(String[] args) {

		int a[] = {2,4,6,8,4,6,7,9};
		
		int s = a.length+1;
		
		int pos = 3;
		int val = 30;
		
		System.out.println(Arrays.toString(insertX(a,s,pos,val)));
	}

	private static int[] insertX(int[] a, int s, int pos, int val) {
		
		int newarr[] = new int[s];
		
		for(int i=0,j=0;i<s;i++)
		{
			if(i==pos)
			{
				newarr[i] = val;
			}
			else
			{
				newarr[i] = a[j];
				j++;
			}
			
		}
		
		return newarr;
		
	}
	
	

}
