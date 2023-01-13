package Basic_Core_Java;

public class Application {

	public static void main(String[] args) {
		
		String info = "Hello";
		System.out.println(info);
		
		float a = 10.5f;
		int b = (int) a;
		
		System.out.println(b);
		
		Application obj = new Application();
		System.out.println(obj instanceof Application);
		
	}
}