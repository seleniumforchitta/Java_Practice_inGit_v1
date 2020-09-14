package Basic_Core_Java;

import java.util.Arrays;

public class RemoveAllOccur {

	public static void main(String[] args) {
		// Remove all occurrences of an element from Array in Java
		
		int[] a = {1,2,3,4,5,1,2,3,4,5};

		//remove all 2
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=2)
			{ 
				a[j++] = a[i];
			}
		}
		
		int b[] = Arrays.copyOf(a, j);
		
		System.out.println(Arrays.toString(b));

	}

}
