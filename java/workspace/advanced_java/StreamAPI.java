package advanced_java;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAPI
{	public static void main(String args[])
	{
		List<Integer>l=Arrays.asList(10,7,18,45,18,18);
		//Declaring a stream and then filtering it to only contain elements greater than 10
//		Stream<Integer>s=l.stream().filter(n->n>10);
//		
//		s.forEach(System.out::println);
//	    System.out.println("ORIGINAL List:");
//		l.forEach(System.out::println);
		//Sorting the list and printing using only line
		System.out.println("After soritng:");
		l.stream().sorted().forEach(System.out::println);
		//Using collect method present in Collectors class to convert List to Set 
		System.out.println("Converted to Set:");
		l.stream().collect(Collectors.toSet()).forEach(System.out::println);
		//Using the map method 
		//Map method converts all individual elements
		//based on the condition in the ()
		System.out.println("The new stream after using map:");
		l.stream().map(n->n+10).forEach(System.out::println);
		
	}
}
