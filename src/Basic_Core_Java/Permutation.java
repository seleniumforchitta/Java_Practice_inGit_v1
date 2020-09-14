package Basic_Core_Java;

public class Permutation {

	public static void main(String[] args) {

		String s = "abc";
		
		for(int i=0,j=0;i<s.length();i++)
		{
				System.out.println(s.charAt(i)+""+s.charAt(++j));
	
		}


	}

}
