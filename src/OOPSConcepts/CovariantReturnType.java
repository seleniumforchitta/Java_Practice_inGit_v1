package OOPSConcepts;


class A{
	A get() {
		return this;
	}
}

class B extends A{
	B get() {
		return this;
	}
	
	void message() {
		System.out.println("Covariant Return type");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		//new B().get().message();

	}

}
