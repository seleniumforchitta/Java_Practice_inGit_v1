 package Basic_Core_Java;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Rest of the code.");
	}
}
