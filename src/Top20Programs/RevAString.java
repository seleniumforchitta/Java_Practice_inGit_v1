package Top20Programs;

public class RevAString {

	public static void main(String[] args) {
		// 12345678
		// 21436587
		
		String str = "12345678";
		String temp = "";
		
		for(int i=0;i<str.length();i++)
		{
			temp = temp+str.charAt(i+1);
			temp = temp+str.charAt(i);
			i++;
		}
		
		
		System.out.println(temp);

	}

}
