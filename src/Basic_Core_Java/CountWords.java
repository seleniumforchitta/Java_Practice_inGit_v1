package Basic_Core_Java;

public class CountWords {

	public static void main(String[] args) {
		
		int count=1;
		String s = "I am a good Boy";
		String a = "";
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==' ')
			{
				count++;
			}
			else 
			{
				a=a+s.charAt(i);
			}
			
		}
		
		System.out.print(count+" - "+a);
	}

}
