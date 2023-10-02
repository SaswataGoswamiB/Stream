package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.LongSummaryStatistics;

public class ReduceImpl {
	
	public static void main(String[] args) {
	
		List<String>bList=Arrays.asList("Sir","Saswata","Goswami");
		
		System.out.println("The Merged value is "+bList.stream().reduce("Mr.",(a,b)->a+" "+b));
		
		
		
		
		System.out.println("---------------------------------------------------------------------------");
		
		

        LongSummaryStatistics longSummaryStatistics
            = new LongSummaryStatistics();
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(4043);
        list.add(7890);
        list.add(6789);
        list.add(890);
        list.add(800);
        list.add(90);
        list.add(10);
        
        System.out.println("Sum using Reduce : "+ list.stream().reduce(Integer::sum).get());
  
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            // Add the values to the LongSummaryStatistics object
            longSummaryStatistics.accept(iterator.next());
        }
  
        // Use various methods to obtain the data
        System.out.println("The count of values is "
                           + longSummaryStatistics.getCount());
        System.out.println("The average of values is "
                           + longSummaryStatistics.getAverage());
        System.out.println("The sum of values is "
                           + longSummaryStatistics.getSum());
        System.out.println("The maximum of values is "
                           + longSummaryStatistics.getMax());
        System.out.println("The minimum of values is "
                           + longSummaryStatistics.getMin());
        System.out.println("The string representation is ");
        System.out.println(longSummaryStatistics.toString());
	}

}
