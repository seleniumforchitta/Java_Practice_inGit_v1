package Basic_Core_Java;

public class ForEach {
	public static void main(String[] args) {
// TODO Auto-generated method stub    
		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.print(name+", ");
		}
	}
}
