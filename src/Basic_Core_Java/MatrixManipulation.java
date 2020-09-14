package Basic_Core_Java;

public class MatrixManipulation {

	public static void main(String[] args) {

		int a[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		int size = a.length;
		System.out.println(size);

		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size; j++) {
				
				//System.out.println(a[i][j]);
				if(i == 0 || i == size-1)
				{
					int temp = a[i][0];
					a[i][0] = a[i][size-1];
					a[i][size-1] = temp;
				}
				
			}
		}
		
		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size; j++) {
				
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}

	}

}

/*
0 1 2 
3 4 5 
6 7 8 

2 1 0
3 4 5
8 7 6 

*/