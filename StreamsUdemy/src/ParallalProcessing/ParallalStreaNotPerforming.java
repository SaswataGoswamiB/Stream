package ParallalProcessing;

import java.util.Arrays;
import java.util.List;

public class ParallalStreaNotPerforming {

	public static void main(String[] args) {

		List<Integer> aList = Arrays.asList(10, 20, 30);

		System.out.println("The Time taken by Sequential String value is : " + 
		sequntialStream(aList));
		
		System.out.println("The Time taken by Parallal String value is : " + 
				ParallalStream(aList));

	}
	
	
	public static long ParallalStream(List<Integer>listIntegers) 
	{
		
		long a=System.currentTimeMillis(); 
		 int c=listIntegers.parallelStream().reduce(Integer::sum).get();
		long b=System.currentTimeMillis();
		
		return b-a;
	}

	public static long sequntialStream(List<Integer>listIntegers) 
	{
		
		long a=System.currentTimeMillis(); 
		 int c=listIntegers.stream().reduce(Integer::sum).get();
		long b=System.currentTimeMillis();
		
		return b-a;
	}
	


}
