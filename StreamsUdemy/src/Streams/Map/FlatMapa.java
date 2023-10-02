package Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapa {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out
				.println("The value is : " + getlist().stream().map(String::toUpperCase).collect(Collectors.toList()));

	}

	public static List<String> getlist() {

		List<String> bList = Arrays.asList("a", "b", "c", "d");
		List<String> cList = Arrays.asList("e", "b", "c", "f");
		List<String> dList = Arrays.asList("g", "b", "h", "c");

		List<List<String>> resultList = new ArrayList<List<String>>();
		resultList.add(bList);
		resultList.add(cList);
		resultList.add(dList);
		
		// Objective here is to flatten List<List<String>> to List<String>
		// Here resultList.stream()----> returns a Stream<List<String>> 
		//but we need a Stream<String> to get a List<String>
		
		System.out.println("The Stream value is : "+resultList.stream());

		System.out.println("The List Format is : " + resultList.stream().collect(Collectors.toList()));
		
		//Soln : we can convert the Stream<List<String>> to Stream<Stream<String>> and then collect it in a list.
		List<String> resultList2 = resultList.stream().flatMap((x) -> x.stream()).collect(Collectors.toList());

		return resultList2;
	}

}
