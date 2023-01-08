package Top20Programs;

import java.util.HashMap;
import java.util.Map;

public class SearchAwordInParagraph {

	public static void main(String[] args) {
		String para = "Java programs are frequently asked in the interview."
				+ " These programs can be asked from control statements, array,"
				+ " string, oops etc. Java basic programs like fibonacci series,"
				+ " prime numbers, factorial numbers and palindrome numbers are "
				+ "frequently asked in the interviews and exams. All these programs"
				+ " are given with the maximum examples and output. If you are new "
				+ "to Java programming, we will recommend you to read our Java tutorial"
				+ " first. Let's see the list of Java programs.";
		String mystr = "Java";
		String[] allstr = para.split(" ");
		int count=0;
		Map<Object, Object> m = new HashMap<Object, Object>();
		System.out.println(allstr.length);
		for(int i=0;i<allstr.length;i++) {
			if(allstr[i].equals(mystr)) {
				count++;
				m.put(i, allstr[i]);
			}
		}
		System.out.println(mystr+" present "+count+" times in the paragraph");
		System.out.println(m);
	}

}
