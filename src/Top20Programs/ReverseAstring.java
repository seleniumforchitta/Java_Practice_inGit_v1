package Top20Programs;

public class ReverseAstring {

	public static void main(String[] args) {
		String a = "12345678";
		String b = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			b = b+a.charAt(i);
		}
		System.out.println(b);
	}

}
