package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitandSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer>aList=Stream.
				 iterate(30,e->e+2).
				 limit(5).
				 collect(Collectors.toList());
		 
		 System.out.println(aList);
		 
		 
		 System.out.println("---------------------------------------------------");
		 
		 
		 
		 //Skips 6,7,8.......
		 List<Integer>aList2=Arrays.asList(6,7,8,9,10);
		 Integer x=aList2.stream().
				 skip(3).reduce(Integer::sum).get();
		 
		 System.out.println("The value using Skip is "+x);

	}

}
