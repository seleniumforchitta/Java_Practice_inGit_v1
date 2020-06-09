package Most_Important_Java_Programs;

public class Reverse_A_String {

	public static void main(String[] args)
	{
		//Logic:1 - String concatenation operator
		String a = "ABCD";
		String b = "";
		
		int len = a.length();
		
		for(int i=len-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println(b);
		
		//Logic:2 - Using character Array
		char c[] = a.toCharArray();
		int len1 = a.length();
		String d = "";
		
		for(int i=len1-1;i>=0;i--)
		{
			d=d+c[i];
		}
		System.out.println(d);
		
		//Logic:3 - Using String Buffer Class
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());
		
	}
	
}
