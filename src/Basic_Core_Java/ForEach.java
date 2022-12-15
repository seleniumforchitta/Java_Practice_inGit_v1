package Basic_Core_Java;

public class ForEach {
	public static void main(String[] args) {
// TODO Auto-generated method stub    
		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.print(name+", ");
		}
		
		
		int[] num = {10,23,43,45,67,76};
		for(int i:num) {
			System.out.println(i);
		}
	}
}
