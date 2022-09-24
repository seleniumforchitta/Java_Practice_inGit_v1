package Most_Important_Java_Programs;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Generate_Random_Number {

	public static void main(String[] args) {


		//Approach1 - Use Random Class
		
		Random rand = new Random();
		int rand_int=rand.nextInt(1000);
		
		System.out.println(rand_int);
		
		double rand_dbl=rand.nextDouble(); //range between 0.0 to 1.0
		System.out.println(rand_dbl);
		
		//Approach1 - Use Math Class
		System.out.println(Math.random()); //Rnadom decimal number
		
		//Approach1 - Apache commons-lang API
		String randNum = RandomStringUtils.randomNumeric(3);
		System.out.println(randNum);
		
		String randStr = RandomStringUtils.randomAlphabetic(3);
		System.out.println(randStr);

	}

}
