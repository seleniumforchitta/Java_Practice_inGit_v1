package Top20Programs;

public class JumbledWordAddition1 {

	public static void main(String[] args) {
		String word = "kuch234bhi4567gg4";
		String wordnum = word.replaceAll("[^0-9]", ",");
		String[] nums = wordnum.split(",");
		int temp=0;
		for(int i=0;i<nums.length;i++)
		{
			if(!nums[i].isEmpty()) {
				System.out.println(Integer.parseInt(nums[i]));
				temp = temp+Integer.parseInt(nums[i]);
				//parseInt() returns primitive integer type (int), whereby valueOf() returns java.lang.Integer
			}
		}
		System.out.println(temp);
	}
}
