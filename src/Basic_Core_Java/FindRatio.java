package Basic_Core_Java;

public class FindRatio {

	public static void main(String[] args) {
		// Find the ratio of postive, negative & zero
		
		int[] a = {0,0,0,0,-4,-3};
		
		float pos = 0;
		float neg = 0;
		float zer = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				pos++;
			} else if(a[i]<0)
			{
				neg++;
			}
			else
			{
				zer++;
			}
		}
		
		System.out.println("percentage of positive number - "+pos/a.length);
		System.out.println("percentage of negative number - "+neg/a.length);
		System.out.println("percentage of zero- "+zer/a.length);

	}

}
