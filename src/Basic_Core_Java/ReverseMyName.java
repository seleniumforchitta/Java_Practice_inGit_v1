/*
 * My Name is Chitta ranjan Swain
 * I have to print in the output Swain ranjan Chitta
 */
package Basic_Core_Java;

public class ReverseMyName {

	public static void main(String[] args) {
		String myName = "Chitta ranjan Swain";
		
		String[] myNamewords = myName.split(" ");
		String myRevName="";
		int len = myNamewords.length;
		for(int i=len-1;i>=0;i--)
		{
			myRevName=myRevName+myNamewords[i]+" ";
		}
		System.out.println(myRevName);
	}

}
