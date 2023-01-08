package javaStrings;

import java.util.Arrays;

public class StringSplits {

	public static void main(String[] args) {
		String str = "The getBytes() method allows you to convert a string to a byte "
				+ "array by encoding or converting the specified string into a sequence "
				+ "of bytes using the default charset of the platform. Below is a Java "
				+ "program to convert a Java String to a byte array.";
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>60) {
				System.out.println(words[i]);
			}
		}
		System.out.println(new StringBuilder(str).reverse().toString());
		String inta = "34567";
		int a = Integer.parseInt(inta);
		System.out.println(a);
		
		int b = 34567;
		String intb = Integer.toString(b);
		System.out.println(b+a);
		
		 String[] strArray = { "Scaler", "by", "InterviewBit"};
		 System.out.println(Arrays.toString(strArray));
	}

}
