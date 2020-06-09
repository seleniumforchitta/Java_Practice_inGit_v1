package Most_Important_Java_Programs;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int arr[]= {3,4,6,3,9,4};
		String dup="";
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					dup=dup+" "+arr[i];
			}
		}
		System.out.println("Duplicates - "+dup);

	}

}
