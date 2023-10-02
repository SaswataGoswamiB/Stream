package Streams.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;

public class Revise {
	
	public static void main(String[] args) {
		
		
		List<Integer>integers=Arrays.asList(23,56,89,3,76);
		
		int result=integers.stream().reduce(Integer::max).get();
		
		System.out.println(result);
		
		System.out.println("WithOut Method Reference ");
		
		int result2=integers.stream().reduce(0,(a,b)->a>b?a:b);
		
		System.out.println("Value s "+result2);
		
		//int average=integers.stream().
		
		//integers averga=integers.stream().reduce(Integer::av)
		
		LongSummaryStatistics longSummaryStatistics=new LongSummaryStatistics();
		
		for(Integer x:integers) 
		{
			longSummaryStatistics.accept(x);
		}
		
		System.out.println("The max value is : "+longSummaryStatistics.getMax());
		
		System.out.println("The averga is "+longSummaryStatistics.getAverage());
	}

}
