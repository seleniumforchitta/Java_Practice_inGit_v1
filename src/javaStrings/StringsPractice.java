package javaStrings;

public class StringsPractice {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Sachin");
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1.concat(s3));
//		
//		String s4 = s1.intern();
//		System.out.println(s4);
//		String s5 = s3.intern();
//		System.out.println(s5);
//		System.out.println(s1.indexOf('c'));
//		System.out.println(s1.isEmpty());
//		System.out.println(s1.isBlank());
//		String s6 = String.join("-",s1,s2,s3,s4,s5);
//		System.out.println(s6);
		
		System.out.println(s1.hashCode());
		s1 = s1.append(" Chitta");
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}

}
