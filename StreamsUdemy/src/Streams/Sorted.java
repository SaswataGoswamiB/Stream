package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public  class Sorted {
	
	public static void main(String[] args) {
		
		List<Integer>alist=Arrays.asList(988,67,96,71,99);
		
		System.out.println("The count vaue is "+" "+alist.stream().count());
		
		System.out.println("The Sorted value is "+alist.stream().sorted().collect(Collectors.toList()));
	}

}
