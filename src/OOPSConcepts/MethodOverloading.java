package OOPSConcepts;

public class MethodOverloading {
	
	int sum(int a, int b, int c) {
		System.out.println("int is called");
		return a+b+c;
	}
	
	double sum(double a, double b, double c) {
		System.out.println("Double is called");
		return a+b+c;
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.sum(2, 4, 5));

	}

}
