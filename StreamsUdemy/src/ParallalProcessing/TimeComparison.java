package ParallalProcessing;

import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TimeComparison {

	public static void main(String[] args) {

		
		System.out.println("The Parallal Stream took : "+checkPerformance(()->TimeComparison.getParallalStream(),20));
//	
//		System.out.println("The Sequential Stream took : "+checkPerformance(TimeComparison::getSequentialStream,20));

		// System.out.println("The Number of Processors Available are :
		// "+Runtime.getRuntime().availableProcessors());
		
		
		//Parallal Stream USing Limit and Skip
		
//		long start1 = System.currentTimeMillis();
//
//		System.out.println("Using Parallal Stream : "
//				+ Stream.iterate(30, e -> e + 2).limit(5).skip(1).collect(Collectors.toList()));
//
//		long end2 = System.currentTimeMillis();
//
//		System.out.println("Time it took for Sequential Stream  : " + String.valueOf(end2 - start1));
//
//
//		long start = System.currentTimeMillis();
//
//		System.out.println("Using Parallal Stream : "
//				+ Stream.iterate(30, e -> e + 2).
//				parallel().limit(5).
//				skip(1).collect(Collectors.toList()));
//
//		long end = System.currentTimeMillis();
//
//		System.out.println("Time it took : " + String.valueOf(end - start));

		
	}

	public static int getSequentialStream() {
		return IntStream.rangeClosed(1, 1000).sum();
	}

	public static int getParallalStream() {
		return IntStream.range(1, 1000).parallel().sum();
	}

	public static long checkPerformance(Supplier<Integer> supplier, int runtime) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < runtime; i++) {
			supplier.get();
		}

		long end = System.currentTimeMillis();
		return end - start;
	}
}
