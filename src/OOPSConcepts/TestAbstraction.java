package OOPSConcepts;

abstract class Bike{
	Bike(){
		System.out.println("Bike is created.");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear is changed in Bike");
	}
}

class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Honda is running");		
	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		Bike b = new Honda();
		b.changeGear();
		b.run();

	}

}
