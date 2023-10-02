package FunctionalInterface.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method

		//System.out.println("Printing :"+t);

	}

	public static void main(String[] args) {
		
//		ConsumerDemo cd=new ConsumerDemo();
//		cd.accept(21);

		// Using Lambda to implement this accept method of the Consumer INterface.

//		Consumer<Integer> consumer = (t) ->
////
//		System.out.println("Printing:" + t);
//
//		consumer.accept(12);
//----------------------------------------------------------------------------------------------------------------	
		List<Integer>alist=Arrays.asList(1,2,3,4,5);
//		
//		Consumer<Integer>caConsumer=(t)->System.out.println("Print first time"+t);
//		
//		Consumer<Integer>cbConsumer=(t)->System.out.println("Print Second  time"+t);
//		
//		alist.stream().forEach(cbConsumer.andThen(caConsumer));
//		
//		alist.stream().forEach(cbConsumer);
		
		//alist.stream().forEach(consumer);
		
		//for each internally calls the Consumer Interface in its argument and calls the accept methof
		
		//of the Consume rinterface internally.
		

		//------------------------------------------------------------------------------------------------
//		System.out.println("START_________________");
//	
//		Consumer<Integer> consumer2=t->System.out.println("Bhag behenchod"+ t);
//		//consumer2.accept(12);
//		alist.stream().forEach(consumer2);
//		
//		System.out.println("END++++++++++++++++++++");
//-------------------------------------------------------------------------------------------------------		
		
//		
	//	alist.stream().forEach(t->System.out.println("Print : "+t));
		
//---------------------------------------------------------------------------------------------------------
		
		Consumer<String> first = x -> System.out.println(x.toLowerCase());
	    Consumer<String> second = y -> System.out.println("aaa " + y);

	    Consumer<String> result = first.andThen(second);
	    
//	    first.accept("Java"); // java
//	    second.accept("Java"); // aaa Java
//	    System.out.println("---------");
//	    result.accept("KUTTA"); // java, aaa Java
//	    
	    List<String>laStrings=Arrays.asList("Saswata","Ram","Shyam","David");
	    
	    laStrings.stream().forEach(result);
	    
	    
		

	}

}
