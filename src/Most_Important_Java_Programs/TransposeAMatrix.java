package Most_Important_Java_Programs;

public class TransposeAMatrix {

	public static void main(String[] args) {
		int original[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int transpose[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = original[j][i];
			}
		}

		System.out.println("Printing Matrix without transpose:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();// new line
		}
		System.out.println("Printing Matrix After Transpose:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();// new line
		}

	}

}
