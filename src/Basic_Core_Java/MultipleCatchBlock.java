package Basic_Core_Java;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			try {
			a[5] = 30/0;
			}
			catch(ArithmeticException e){
				System.out.println(e+" - Task1 is completed.");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e+" - Task2 is completed.");
		}
		catch(Exception e){
			System.out.println(e+" - Task3 is completed.");
		}
		System.out.println("Rest of the code");
	}

}
