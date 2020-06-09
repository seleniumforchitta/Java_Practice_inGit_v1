package Most_Important_Java_Programs;

public class MaxMinOfArray {

	public static void main(String[] args) {
		

		int arr[]= {23,4,6,7,9,21,22,5};
		int max=0;
		int ndmax=0;
		int ndmin=arr[0];
		int temp=0;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];	
				
			}
			if(arr[i]>ndmax)
			{
				temp=arr[i];
				if(temp<max)
					ndmax=temp;
			}
			
			if(min>=arr[i])
			{
				min=arr[i];
			}
			if(ndmin>arr[i])
			{
				temp=arr[i];
				if(temp>min)
					ndmin=temp;
			}
		}
		System.out.println("Max - "+max+"\nMin - "+min);
		System.out.println("2nd Max - "+ndmax);
		System.out.println("2nd Min - "+ndmin);

	}

}
