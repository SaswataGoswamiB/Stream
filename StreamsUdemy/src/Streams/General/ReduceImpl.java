package Streams.General;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>aList=Arrays.asList(1,45,2);
		
		System.out.println("The reduce with int value is :"+ reduce(aList));
		
		Optional<Integer>blistOptional=reducee(aList);
		
		System.out.println("The vale is Present ? "+blistOptional.isPresent());
		
		System.out.println("Reduce with Optional : "+blistOptional.get());
		
		
		

	}
	
	public  static int reduce(List<Integer>integers) 
	{
		// return integers.stream().reduce(1,(a,b)->a*b);
		
		return  integers.stream().reduce(1,(x,y)->x*y);
	}
	
	
	public static  Optional<Integer> reducee(List<Integer>integers)
	{
		 return integers.stream().reduce((a,b)->a*b);
	}

}
