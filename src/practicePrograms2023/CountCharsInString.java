package practicePrograms2023;

public class CountCharsInString {

	public static void main(String[] args) {
		
		String a = "Chittaranjan Swain";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) != ' ')
				count++;
		}
		System.out.println("CountCharsInString = "+count);
		a = new StringBuilder(a).reverse().toString();
		System.out.println(a);
	}

}
