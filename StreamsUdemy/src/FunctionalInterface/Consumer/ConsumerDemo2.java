package FunctionalInterface.Consumer;

import java.util.function.Predicate;

public class ConsumerDemo2 implements Predicate<Integer> {

	
	
	public static void main(String[] args) 
	{
		Predicate<Integer> predicate=new ConsumerDemo2();
		
		System.out.println(predicate.test(5));
	}

	@Override
	public boolean test(Integer t) {

		if (t % 2 == 0)
			return true;
		else
			return false;
	}

}
