package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>aList=Arrays.asList("a","b","c","d");
		List<String>resultList=aList.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Using Map value to Convert : "+resultList);

	}

}
