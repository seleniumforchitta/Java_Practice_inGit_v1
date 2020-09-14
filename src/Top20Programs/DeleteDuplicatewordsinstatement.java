package Top20Programs;

import java.util.ArrayList;

public class DeleteDuplicatewordsinstatement {

	public static void main(String[] args) {

		String str = "Biswajit Beheravery is a very very Good Boy";
		String[] set;
		set = str.split(" ");
		String temp = "";
		
		ArrayList set1 = new ArrayList();
		for(int i = 0; i<set.length; i++)
		{
			if(!set1.contains(set[i]))
			//if(!temp.contains(set[i]))
			{
				set1.add(set[i]);
				temp = temp+" "+set[i];
			}
			
		}
	
		System.out.println(temp);
		
		
	}
}
