package Top20Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {


		int[] a = {7,4,9,5,8,2,1};
		int[] c = new int[a.length-1];
		ArrayList b = new ArrayList();
		
		for(int i=0,k=0;i<a.length;i++)
		{
			if(a[i]==9)
			{
				System.out.println("9 is present in "+i+"th position.");
					//a[i] = a[i+1];
				//i++;
				continue;
			}
			b.add(a[i]);
			c[k++]=a[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+",");
		}
		System.out.println(b);
	

	}

}
