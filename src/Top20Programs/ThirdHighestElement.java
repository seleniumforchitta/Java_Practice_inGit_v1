package Top20Programs;

public class ThirdHighestElement {

	public static void main(String[] args) {

		int[] a = {7,4,5,8,9,2,1};
		int temp;

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println(a[2]);		
			
	}
}


