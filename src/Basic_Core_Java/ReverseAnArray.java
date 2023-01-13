package Basic_Core_Java;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = {22,33,44,55,66,77,88};
		int b = arr.length-1;
		int[] arr1 = new int[b+1];		
		int n=0;
		for(int i=b;i>=0;i--) {
			arr1[n++]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr[i]+ " - ");
			System.out.println(arr1[i]);
			
		}

	}

}
