package OOPSConcepts;

class Sum{
	double sum(double a, double b, double c) {
		System.out.println("Parent is called");
		return a+b+c;
	}
}

class Add extends Sum{
	double sum(double a, double b, double c) {
		System.out.println("Child is called");
		return a+b+c;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		//Sum s = new Sum();
		Add a = new Add();
		System.out.println(a.sum(2, 4, 5));

	}

}