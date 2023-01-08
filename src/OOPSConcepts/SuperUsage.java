package OOPSConcepts;

class Abc{
	String clr = "white";
	void abc() {
		System.out.println("I am A");
	}
	Abc(){
		System.out.println("Abc is created");
	}
}

class Bcd extends Abc{
	String clr = "black";
	void abc() {
		super.abc();  // Used to invoke parent class method 
		System.out.println(super.clr); // Used to invoke parent class instance variable 
		System.out.println(clr);
		System.out.println("I am B");
	}
	{
		System.out.println("Instance initializer block");
	}
	Bcd(){
		super();  // Used to invoke parent class constructor
		System.out.println("Bcd is created"); 
	}
}

public class SuperUsage {
	
	public static void main(String[] args) {
		Bcd b = new Bcd();
		b.abc();

	}

}
