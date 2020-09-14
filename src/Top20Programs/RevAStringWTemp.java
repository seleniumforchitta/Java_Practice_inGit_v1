package Top20Programs;

public class RevAStringWTemp {

	public static void main(String[] args) {
		// 12345678
		// 21436587
		
		String str = "12345678";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(++i));
			i--;
			System.out.print(str.charAt(i));
			i++;
		}
	}

}
