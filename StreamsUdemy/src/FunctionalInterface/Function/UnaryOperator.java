package FunctionalInterface.Function;

import java.util.Comparator;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// is a functional interface that represents a function that takes 
		//a single argument of a certain type and returns a result of the same type.
		
		java.util.function.UnaryOperator<String>unaryOperator=(a)->a.concat("Goswami");
		
		System.out.println("Unary operator: "+unaryOperator.apply("Saswata"));
		
		Comparator<Integer> comaComparator=(a,b)->a.compareTo(b);

	}

}
