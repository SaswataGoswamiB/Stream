package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemotwo {

	public static void main(String args[]) {
//		Predicate<Integer>predicate=(t)->
//		{
//			if(t%2==0) 
//			{
//				return true;
//			}
//			else 
//			{
//				return false;
//			}
//		};
//		
//		System.out.println(predicate.test(7));;

//		Predicate<Integer> predicate = t -> t % 2 != 0;
//		
//		Predicate<Integer> predicate2= t-> t>=1;
//		
//		Consumer<Integer> consyConsumer=t->System.out.println("The Fileterd Values are : "+t);
//
//		//System.out.println(predicate.test(8));
//
//		List<Integer> alist = Arrays.asList(1, 2, 3, 4, 5);
////		
////		alist.stream().filter(predicate.and(predicate2)).forEach(consyConsumer); 
//		
//		Predicate<Integer>predicate3= p->p % 3==0;
//		
//		Consumer<Integer>consumer=c->System.out.println("Multiplied value is :::"+c*3);;
//		
//		alist.stream().filter(predicate3).forEach(consumer);
		
		
		List<Integer> aList= Arrays.asList(6,3,1,2,4,82,46,44);
		
		Predicate<Integer> predicate=p->p%2==0;
		
		Consumer<Integer>consumer=c->System.out.println("The filtered value is :"+c);
		
		aList.stream().filter(predicate).sorted().forEach(consumer);
		


	}

}
