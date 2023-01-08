package Top20Programs;

public class SortingAnArray {

	public static void main(String[] args) {
		int[] arr = {100,12,34,2,45,33,67,56};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i]; 
					arr[i] = temp;	 
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	    }
	}
}
