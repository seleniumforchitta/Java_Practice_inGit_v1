package Basic_Core_Java;

public class ReplaceAWord {

	public static void main(String[] args) {
		
		String s = "This is a beautiful day.";
		String s1 = s.replace("beautiful", "good");
		System.out.println(s1);
		
		String[] words = s.split(" ");
		String t = "";
		
		int len = words.length;	
		for(int i=0;i<len;i++)
		{
			if(words[i].contentEquals("beautiful"))
			{
				t=t+"good"+" ";
			}
			else t=t+words[i]+" ";
		}
		System.out.println(t);
		
		String a = "beautiful";
		String b = "beautiful";
		a = a.concat(" day");
		System.out.println(a);
		System.out.println(b);

	}

}
