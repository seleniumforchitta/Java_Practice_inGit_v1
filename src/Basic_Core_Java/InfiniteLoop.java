package Basic_Core_Java;

public class InfiniteLoop {

	public static void main(String[] args) {
		int counter = 0;
		for(;;) {
			System.out.println(counter);
			counter++;
			if(counter>100) {
				System.out.println("Do Nothing");
				break; 
 				}
		}

	}
}