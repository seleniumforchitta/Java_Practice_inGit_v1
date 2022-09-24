/*
 * arra = [1,2,3,4,6]
 * you have to write a function dat will return an element such that 
 * sum of all d element left to that element and sum of all the element 
 * right to that element is same
 * 
 * for example in the above input the output shoud be 4
 * since left to 4, 1+2+3=6
 * and right to 4 sum =6 
 */
package sagar;

public class ArrayManipulation1 {
	
	int[] arr = {1,1,1,3,4,5,6,10,7,8,9,10,10,11,20,10,3,2};
	int len = arr.length;
	static int count = 0;

	
	void findTheMiddleMan()
	{
		for(int i=1;i<len;i++)
		{
			int leftSum = 0;
			int rightSum = 0;
			
			int k = i;
			while(k>0)
			{
				leftSum = leftSum + arr[k-1];
				k--;
			}
			
			int j = i;
			while(j<len-1)
			{
				rightSum = rightSum + arr[j+1];
				j++;
			}
			
			if(leftSum==rightSum)
			{
				System.out.println(arr[i]+" that is present at "+i+"th"+" position is the Middle Man.");
				count++;
			}	
		}
		if(count==0)
		{
			System.out.println("No Middle Man Found.");
		}
	}

	public static void main(String[] args) {
		ArrayManipulation1 obj = new ArrayManipulation1();
		obj.findTheMiddleMan();

	}

}
