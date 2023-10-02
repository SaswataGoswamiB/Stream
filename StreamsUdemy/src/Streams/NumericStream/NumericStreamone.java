package Streams.NumericStream;

import java.util.Arrays;
import java.util.List;

public class NumericStreamone {

	
	public static void main(String[] args) {
		
		
		List<Integer>aList=Arrays.asList(1,2,3,4,5);
		
		System.out.println("The sume is : "+getSume(aList));
		
	}
	
	
	//What happens over here is :
	
	//though we are passing List of Integer over here but the return type of the method id int.
	//If we make the int as Integer it will also work by autoboc=xing int to Integer
	//But the default return type of the Stream is int not Integer.
	//So when we pass a List of Integer,Under the hood a unboxing happens and Integer is converted to int.
	//Here Numeric Stream comes into the Picture.
	public static int getSume(List<Integer>ait) 
	{
		return  ait.stream().reduce((a,b)->a+b).get();
	}
}
