package streamsTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamPractice {

	//count the number of names starting with alphabet A in list
	
	@Test
	public void regular()
	{
		List<String> names = new ArrayList<String>();
		names.add("Amul");
		names.add("Arun");
		names.add("Bapu");
		names.add("Amit");
		names.add("Anuj");
		int count = 0;
		
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println("Total count in Regular Methods = "+count);
	}
	
	@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amul");
		names.add("Arun");
		names.add("Bapu");
		names.add("Amitabh");
		names.add("Raman");
		
		
		Long count = names.stream().filter(s->s.startsWith("A")).count(); 
		// All arraylist we are moving to Stream API
		// Filter method takes an argument, i.e. Lambda Expression 
		// Return type of count() is Long here.
		// So here filer() is the intermediate operation & count() is the terminal operation
		
		System.out.println("Total count in Stream Methods = "+count);
		
		/* Everytime to use stream(), we don't need collection like ArrayList or Set, rather 
		 * we can also create light weight string compatible collection like below - Stream.of() 
		 * using Stream package 
		 */
		
		Long count1 = Stream.of("Amul", "Arun", "Amit", "Anshu", "Golu").filter(s->s.startsWith("A")).count();
		System.out.println("Total count in Stream.of() = "+count1);
		
		// There is no life for intermediate operation, if there is no terminal operations. 
		// Terminal operation will execute only if intermeidate operation returns true
		
		/* if the second part of the lambda expression is of more than 1 sentence then we can use
		 * curly braces also like below .
		 */
		
		Long d = Stream.of("Amul", "Arun", "Baby", "Anshu", "Golu").filter(s->
		{
			if(s.startsWith("A"))
			return true;
			else return false;
		}).count();
		System.out.println("Total count in Stream.of() using {} = "+d);
		
		
		// Print all the names of ArrayList  where length of the name is greater than 4
		System.out.println("Print all the names of ArrayList  where length of the name is greater than 4");
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		// I need only the first element satisfyling above condition
		System.out.println("I need only the first element satisfyling above condition");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}
	
	@Test
	public void streamMap()
	{
		/* Print names which has last letter as "a" with uppercase. o/p is as below - 
			ARUNA
			GOLUA
		*/
		System.out.println("Print names which has last letter as \"a\" with uppercase.");
		Stream.of("Amul", "Aruna", "BabyDoll", "Anshul", "Golua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		/* Print names which has first letter as "a" with uppercase and sorted. o/p is as below - 
			AMUL
			ANSHUL
			ARUNA
		*/
		System.out.println("Print names which has first letter as \"a\" with uppercase and sorted.");
		List<String> names = Arrays.asList("Adam", "Aruna", "BabyDoll", "Anshul", "Golua");
		
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		// Merge 2 arraylist and sort them 
		System.out.println("Merging 2 arraylist and sort them");
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Amul");
		names1.add("Arun");
		names1.add("Bapu");
		names1.add("Amitabh");
		names1.add("Raman");
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.print(s+"\t"));
		
		
		// Adding Validation using Stream 
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect()
	{
		// Collect - it will collect all the result and will store it in a collection
		List<String> ls = Stream.of("Amul", "Aruna", "BabyDoll", "Anshul", "Golua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println("First element in the Collectors = "+ls.get(0));
		// For this example you can use Limit() as well.
		
		
		//Print unique number from the array
		//Sort the Array
		System.out.println("Print unique number from the array & Sort it.");
		List<Integer> values = Arrays.asList(3,2,2,4,5,7,8,4);
		values.stream().distinct().forEach(s->System.out.print(s+"\t"));
		
		//After sorting give the 3rd index
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("\n3rd index is = "+li.get(3));
	}
}
