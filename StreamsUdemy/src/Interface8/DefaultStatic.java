package Interface8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultStatic {

	public static void main(String[] args) {

		//name();
		//nameCollections();
		//deafultsortmethod();
		//deafultsortmethodof();
		

	}

	public static void name() {
		
		List<String> aliStrings = Arrays.asList("Gill", "Rohit", "Virat", "Shreyash", "Rahul", "Jaddu");

		Comparator<String> ciComparator = (a, b) -> a.compareTo(b);
		List<String> finallist = aliStrings.stream().sorted((x, y) -> x.charAt(3) - y.charAt(3))
				.collect(Collectors.toList());
		System.out.println("Using name  Stream to Sort : " + finallist);

	}

	public static void nameCollections() {
		List<String> aliStrings = Arrays.asList("Gill", "Rohit", "Virat", "Shreyash", "Rahul", "Jaddu");
		Collections.sort(aliStrings);
		System.out.println("Using Collections method  to Sort : " + aliStrings);
	}

	// using deault Sort method of List Interface and Comparator.naturalOrder.
	public static void deafultsortmethod() {
		List<String> aliStrings = Arrays.asList("Gill", "Rohit", "Virat", "Shreyash", "Rahul", "Jaddu");
		// Over here sort is a default method that is present under the List Interface.
		// Comparator.naturalOrder sorts the elements in ascending order.
		aliStrings.sort(Comparator.naturalOrder());
		System.out.println("The List using natural Order : "+aliStrings);
	}

	// using deault Sort method of List Interface and Comparator.naturalOrder.
	public static void deafultsortmethodof() {
		
		List<String> aliStrings = Arrays.asList("Gill", "Rohit", "Virat", "Shreyash", "Rahul", "Jaddu");
		// Over here sort is a default method that is present under the List Interface.
		// Comparator.naturalOrder sorts the elements in ascending order.
		aliStrings.sort(Comparator.reverseOrder());
		System.out.println("The List Suing Reverse Order : "+aliStrings);
	}

}
