package practicePrograms2023;

public class Palindrome {

	public static void main(String[] args) {
		String str = "katak";
		String str1 = new StringBuilder(str).reverse().toString();
		if(str.equals(str1)) {
			System.out.println("it is palindrome");
		} else System.out.println("it is not a palindrome.");
		
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(str1)) {
			System.out.println("it is palindrome");
		} else System.out.println("it is not a palindrome.");

	}

}
