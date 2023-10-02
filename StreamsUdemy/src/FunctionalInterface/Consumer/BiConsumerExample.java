package FunctionalInterface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BiConsumer<String,String>aBiConsumer=(a,b)->System.out.println("The value of a is "+a+" "+"The value of b is "+b);
//		aBiConsumer.accept("Rohit","Virat");
//		
//		BiConsumer<Integer,Integer> bbBiConsume=(a,b)->System.out.println("The multiplied value is : "+a*b);
//		bbBiConsume.accept(10,5);
		
		
		List<Integer>aList=Arrays.asList(2,3,89,74,4,66);
		
		List<Integer>bList=aList.stream().
				peek(a->System.out.println("The valuas are :"+a*2)).
				filter(a->a%2==0).
				peek(a->System.out.println("The valuas after filtering are :"+a))
				.collect(Collectors.toList());
		
		System.out.println(bList);
		
//		Consumer<Integer>conaConsumerDemo=(a)->System.out.println("The value us "+a);
//		aList.stream().peek(conaConsumerDemo).filter();
		
//		 List<Integer>dList=aList.stream().filter(a->a%2==0).
//		peek(a->System.out.println("The value is "+a))
//		.collect(Collectors.toList());
//		 
//		 System.out.println(dList);

	}

}
