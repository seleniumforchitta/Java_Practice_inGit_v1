package Basic_Core_Java;

public class ThrowsNThrow {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("Not eligible to vote");
		else
			System.out.println("Welcome to Vote - Chittaranjan");

	}

	public static void main(String[] args) {
		validate(18);
		System.out.println("Rest of the code");
	}
}
